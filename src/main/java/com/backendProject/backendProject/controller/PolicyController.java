package com.backendProject.backendProject.controller;

import com.backendProject.backendProject.form.GetAQuoteForm;
import com.backendProject.backendProject.model.Policy;
import com.backendProject.backendProject.model.User;
import com.backendProject.backendProject.repository.PolicyRepo;
import com.backendProject.backendProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class PolicyController {

    @Autowired
    PolicyRepo policyRepo;

    @Autowired
    UserRepository userRepository;

    @PostMapping("/addPolicy")
    public Policy addPolicy(@RequestBody GetAQuoteForm getAQuoteForm){
        User user = userRepository.findByMailId(getAQuoteForm.getMailId());
        Policy policy = new Policy();
        policy.setAssetName(getAQuoteForm.getProductType());
        policy.setPremiumAmount(getAQuoteForm.getPremiumAmount());
        policy.setStatus("OnGoing");
        policy.setMailId(user.getMailId());
        policy.setUser(user);
        return policyRepo.save(policy);
    }

    @GetMapping("/allPolicies")
    public List<Policy> allPolicies(){
        return policyRepo.findAll();
    }

//    @GetMapping("/allMyPolicies/{userId}")
//    public List<Policy> allMyPolicy(@PathVariable("userId") String userId){
//        return policyRepo.findAll(userId);
//    }
    @GetMapping("/allMyPolicies/{userId}")
    public List<Policy> allMyPolicy(@PathVariable("userId") String userId){
        System.out.println(userId);
        List<Policy> policies = policyRepo.findAll();
        List<Policy> res = new ArrayList<>();
        for (Policy policy: policies) {
            System.out.println(policy.getMailId().equals(userId));
            if (policy.getMailId() != null && policy.getMailId().equals(userId)) {
                policy.setPolicyNo(Integer.parseInt("202112" + policy.getPolicyNo()));
                res.add(policy);
            }
        }
        System.out.println(res);

        return res;
    }
}

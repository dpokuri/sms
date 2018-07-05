package com.tvs.sms.controller;

import com.tvs.sms.model.AdminUser;
import com.tvs.sms.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sms/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    AdminUserService adminUserService;

    @PostMapping("/login")
    public boolean login(@RequestBody AdminUser adminUser) {

        return adminUserService.login(adminUser);
    }


}

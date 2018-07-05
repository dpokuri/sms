package com.tvs.sms.service;

import com.tvs.sms.model.AdminUser;
import com.tvs.sms.repository.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminUserService {

    @Autowired
    AdminUserRepository adminUserRepository;

    public boolean login(AdminUser adminUser){

        AdminUser dbAdminUser = adminUserRepository.findByUserId(adminUser.getUserId());

        if(adminUser.getUserId().equals(dbAdminUser.getUserId()) && adminUser.getPassword().equals(dbAdminUser.getPassword())){

            return true;
        }
        return false;
    }


}

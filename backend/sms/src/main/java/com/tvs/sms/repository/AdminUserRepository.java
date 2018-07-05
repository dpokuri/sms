package com.tvs.sms.repository;

import com.tvs.sms.model.AdminUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserRepository  extends MongoRepository<AdminUser, String> {

  AdminUser findByUserId(String userId);


}

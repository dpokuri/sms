package com.tvs.sms.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "admin_user")
public class AdminUser {

    @Id
    private String empId;
    private String userId;
    private  String name;
    private  String password;
    private  String phone;
    private String emailId;
    private List<Role> roles;
    private Address address;

    public AdminUser() {

    }

    public AdminUser(String empId, String userId, String name, String password, String phone, String emailId, List<Role> roles, Address address) {
        this.empId = empId;
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.emailId = emailId;
        this.roles = roles;
        this.address = address;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "empId=" + empId +
                ", userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", emailId='" + emailId + '\'' +
                ", roles=" + roles +
                ", address=" + address +
                '}';
    }

}

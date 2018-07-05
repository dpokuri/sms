package com.tvs.sms.model;

public class Address {

    private String address_line1;
    private String address_line2;
    private String district;
    private String state;
    private String pincode;
    private String country;

    public Address() {
    }

    public Address(String address_line1, String address_line2, String district, String state, String pincode, String country) {
        this.address_line1 = address_line1;
        this.address_line2 = address_line2;
        this.district = district;
        this.state = state;
        this.pincode = pincode;
        this.country = country;
    }


    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_line1='" + address_line1 + '\'' +
                ", address_line2='" + address_line2 + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", pincode='" + pincode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }


}

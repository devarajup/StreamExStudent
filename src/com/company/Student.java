package com.company;

import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String pincode;
    private List<PhoneNum> phoneNums;

    public Student(Integer id, String name, Integer age, String pincode, List<PhoneNum> phoneNums) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.pincode = pincode;
        this.phoneNums = phoneNums;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public List<PhoneNum> getPhoneNums() {
        return phoneNums;
    }

    public void setPhoneNums(List<PhoneNum> phoneNums) {
        this.phoneNums = phoneNums;
    }
}

package com.rinzin.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private String stuClass;
    private double height;
    private int weight;
    private String phone;

    public Student(){}
    public String getName() {
        return name;
    }
    public Student setName(String name) {
        this.name = name;
        return this;
    }
    public int getAge() {
        return age;
    }
    public Student setAge(int age) {
        this.age = age;
        return this;
    }
    public String getStuClass() {
        return stuClass;
    }
    public Student setStuClass(String stuClass) {
        this.stuClass = stuClass;
        return this;
    }
    public double getHeight() {
        return height;
    }
    public Student setHeight(double height) {
        this.height = height;
        return this;
    }
    public int getWeight() {
        return weight;
    }
    public Student setWeight(int weight) {
        this.weight = weight;
        return this;
    }
    public String getPhone() {
        return phone;
    }
    public Student setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public static Student builder(){
        return new Student();
    }
}

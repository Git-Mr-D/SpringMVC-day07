package com.java.pojo;

public class Usere {
    private String uName;
    private Integer age;
    private Double height;

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Usere(String uName, Integer age, Double height) {
        this.uName = uName;
        this.age = age;
        this.height = height;
    }
    public Usere(){

    }

    @Override
    public String toString() {
        return "Usere{" +
                "uName='" + uName + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

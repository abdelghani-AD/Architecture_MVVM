package com.example.mvvm_architecture;

public class Pesonne {
    private String name ;
    private Integer age;
    private Double taille;

    public Pesonne(String name, Integer age, Double taille) {
        this.name = name;
        this.age = age;
        this.taille = taille;
    }

    public String getName() {return name;}
    public Integer getAge() {return age;}
    public Double getTaille() {return taille;}

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setTaille(Double taille) {
        this.taille = taille;
    }
}

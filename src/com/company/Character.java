package com.company;

public class Character {
    private String name;
    private String gender;
    private int age;
    private double health_points;
    private double armor_points;
    private double damage;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHealth_points() {
        return health_points;
    }

    public void setHealth_points(double health_points) {
        this.health_points = health_points;
    }

    public double getArmor_points() {
        return armor_points;
    }

    public void setArmor_points(double armor_points) {
        this.armor_points = armor_points;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 *
 * @author AJIT BHOLE
 */
public class Student {
    
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String continent;
    private String experience;
    private String photoPath;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getContinent() {
        return continent;
    }

    public String getExperience() {
        return experience;
    }

    public String getPhotograph() {
        return photoPath;
    }
    
    
    void setName(String name){
        this.name = name;
    }
    
    void setAge(int age){
        this.age = age;
    }
    
    void setGender(String gender){
        this.gender = gender;
    }
    
    void setPhone(String phone){
        this.phone = phone;
    }
    
    void setContinent(String continent){
        this.continent = continent;
    }
    
    void setExperience(String experience){
        this.experience = experience;
    }
    
     void setPhotograph(String photoPath){
        this.photoPath = photoPath;
    }
}



package com.company;

import java.util.ArrayList;

public class User {
    private String userName;
    private String email;
    private ArrayList<Skill> skill;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Skill> getSkill() {
        return skill;
    }

    public void setSkill(ArrayList<Skill> skill) {
        this.skill = skill;
    }

    public void addSkill(Skill s){
        skill.add(s);
    }

}

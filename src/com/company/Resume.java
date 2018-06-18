package com.company;

import java.util.ArrayList;

public class Resume {
    private User user;
    private ArrayList<Skill> skill;
    private ArrayList<Education> education;
    private ArrayList<Job> job;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Skill> getSkill() {
        return skill;
    }

    public void setSkill(ArrayList<Skill> skill) {
        this.skill = skill;
    }

    public ArrayList<Education> getEducation() {
        return education;
    }

    public void setEducation(ArrayList<Education> education) {
        this.education = education;
    }

    public ArrayList<Job> getJob() {
        return job;
    }

    public void setJob(ArrayList<Job> job) {
        this.job = job;
    }


}

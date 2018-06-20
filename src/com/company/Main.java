package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String input = "";

        User user = new User();
        ArrayList<Skill> skillList = new ArrayList<>();
        ArrayList<Education> educationList = new ArrayList<>();
        ArrayList<Job> jobList = new ArrayList<>();
        Resume resume = new Resume();

        //prompt user for their name and email  (put in user class)
        print("Enter your full name: ");
        input = keyboard.nextLine();
        user.setUserName(input);
        print("Enter your email: ");
        input = keyboard.nextLine();
        user.setEmail(input);
        //prompt user for their skills (put in arraylist)
        input = "";//clear input
        println("Enter each of your Skills:");
        while (!(input.equalsIgnoreCase("n"))){
            Skill s = new Skill();
            print("Enter your skill: ");
            input = keyboard.nextLine();
            s.setSkill(input);
            print("Enter your proficiency: ");
            input = keyboard.nextLine();
            s.setProficiency(input);
            print("Do you want to enter another(y/n)? ");
            input = keyboard.nextLine();
            skillList.add(s);
        }


        //prompt user for their education (put in arraylist)
        input = "";//clear input
        println("Enter your Eductaion:");
        while (!(input.equalsIgnoreCase("n"))){
            Education e = new Education();
            input = keyboard.nextLine();
            e.setDegree(input);
            input = keyboard.nextLine();
            e.setSchool(input);
            input = keyboard.nextLine();
            e.setYear(input);
            print("Do you want to enter another(y/n)? ");
            input = keyboard.nextLine();
            educationList.add(e);
        }

        //prompt user for their job experience (put in arraylist)
        input = "";//clear input
        println("Enter each of your Jobs:");
        while (!(input.equalsIgnoreCase("n"))){
            Job j = new Job();
            input = keyboard.nextLine();
            j.setCompany(input);
            input = keyboard.nextLine();
            j.setJobTitle(input);
            input = keyboard.nextLine();
            j.setStartDate(input);
            input = keyboard.nextLine();
            j.setEndDate(input);
            print("Do you want to enter another(y/n)? ");
            input = keyboard.nextLine();
        }


        //add all the information to the resume class
        resume.setUser(user);
        resume.setEducation(educationList);
        resume.setJob(jobList);
        resume.setSkill(skillList);

    }
    private static void println(String output){
        System.out.println(output);
    }
    private static void print(String output) {
        System.out.print(output);
    }
}

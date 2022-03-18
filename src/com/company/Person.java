package com.company;

public class Person {
    private String name;
    private String designation;

    public Person(String name , String designation) {
        this.name = name;
        this.designation = designation;
    }



    static void learn (String learn){
        System.out.println(learn);


    }

    static void walk(String walk){
        System.out.println(walk);

    }
    static void eat(String meal){
        System.out.println(meal);

    }

    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return  name;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }
    public String getDesignation(){
        return designation;
    }


    @Override
    public String toString(){
        return getName() + " "+ getDesignation();

    }
}

package com.company;

public class Programmer extends Person {
    private String companyName;



    public Programmer(String name, String designation , String companyName){
        super (name , designation);
        this.companyName = companyName;
    }

    static void codding(String codding){
        System.out.println("java");
    }



    public void setCompanyName(String bandName){
        this.companyName = companyName;
    }
    public String getCompanyName(){
        return companyName;
    }


    @Override
    public String toString(){
        return getName() + " "+ getDesignation() + " " + getCompanyName() ;

    }
}

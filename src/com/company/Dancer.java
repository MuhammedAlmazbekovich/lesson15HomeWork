package com.company;

public class Dancer extends  Person{
    private String groupName;

    public Dancer(String name , String designation , String groupName){
        super(name, designation);
        this.groupName = groupName;
    }


    static void dancing( String dancing){
        System.out.println(dancing);


    }

    public void setGroupName(String bandName){
        this.groupName = groupName;
    }
    public String  getGroupName(){
        return groupName;
    }




    @Override
    public String toString(){
        return getName() + " "+ getDesignation() + " " + getGroupName() ;

    }


}

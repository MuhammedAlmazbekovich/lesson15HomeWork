package com.company;

public class Singer extends Person{
    private String bandName;


    public void setBandName(String bandName){
        this.bandName = bandName;
    }
    public String getBandName(){
        return bandName;
    }


    public Singer(String name , String designation, String bandName){
        super(name , designation);
        this.bandName = bandName;


    }
    static void singing( String sing){



    }

    static void playGuitar(String play){

    }

    @Override
    public String toString(){
        return super.getName() + " "+ super.getDesignation() + " "+ getBandName() ;

    }



}

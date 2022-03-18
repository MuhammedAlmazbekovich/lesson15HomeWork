package com.company;

public class Main {

    public static void main(String[] args) {
	Person person = new Person("Vladimir Putin" , "not a person");
    Programmer programmer = new Programmer("Anonymous" , "programmer" , "without company name");
    Dancer dancer = new Dancer("Sergey Shoigu" , "dancer","Ministry of Defense");
    Singer singer = new Singer("Sergey Lavrov", "singer","Ministry of Foreign Affairs");


    person.eat("meat");
    person.learn("kill");
    person.walk("at school");

    programmer.codding("JAVA");

    dancer.dancing("bachata");

    singer.singing("pesnya");
    singer.playGuitar("Guitar");

        System.out.println(singer );
        System.out.println(person);
        System.out.println(programmer);
        System.out.println(dancer);





    }
}

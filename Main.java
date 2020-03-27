package com.zipcodewilmington;

public class Main {
    public static void main(String[] args) {
        Person p1,p2,p3;

        p1 = new Person("Evan","haggard");
        p2 = new Person("High","Speed");
        p3 = new Person("Cruse","Control");

        Person[] allPeople = {p1,p2,p3};

        PersonHandler person = new PersonHandler(allPeople);
        person.getPersonArray();
        System.out.println(person.whileLoop());
        System.out.println("##########################");
        System.out.println(person.forLoop());
        System.out.println("##########################");
        System.out.println(person.forEachLoop());
        System.out.println("##########################");
    }
}

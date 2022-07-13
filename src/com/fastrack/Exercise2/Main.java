package com.fastrack.Exercise2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListPerson ListPerson=new ListPerson(List.of(new Person("Vlad", 20,"black"),
                new Person("Adrian",25,"blonde"),
                new Person("Alex",40,"blonde")));

        System.out.println(ListPerson.printNameList(ListPerson.getList()));

        System.out.println(ListPerson.personOlderThan(20,ListPerson.getList()));
    }
}

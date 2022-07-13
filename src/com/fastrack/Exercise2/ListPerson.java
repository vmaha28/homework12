package com.fastrack.Exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListPerson {
    List<Person> list=new ArrayList<>();

    public ListPerson(List<Person> list) {
        this.list = list;
    }

    public List<Person> getList() {
        return list;
    }

    List<String> printNameList(List<Person> list){
        List<String> nume=new ArrayList<>();
        for(Person person :list){
            nume.add(person.getName());

        }
        return nume;
    }
    Map<String,Integer> mapPerson(List<Person> list){
        Map<String,Integer> result=new HashMap<>();
        for(Person person:list){
            result.put(person.getName(),person.getAge());
        }
        return result;

    }

    List<Person> personOlderThan(int age, List<Person> list){
        List<Person> result=new ArrayList<>();
        for(Person person: list){
            if(person.getAge()>age){
                result.add(person);
            }
        }
        return result;
    }

    Map<String,List<String>> hairColorToName(List<Person> list){
        Map<String,List<String>> result=new HashMap<>();
        for(Person person: list){
            List<String> nameList=result.get(person.getHairColour());
            if(nameList==null){
                nameList=new ArrayList<>();
                result.put(person.getHairColour(),nameList);
            }
            nameList.add(person.getName());
        }
        return result;

    }

    Map<Integer, List<Person>> ageToPerson(List<Person> list){
        Map<Integer, List<Person>> result=new HashMap<>();
        for(Person person: list){
            List<Person> namePersonList=result.get(person.getAge());
            if(namePersonList==null){
                namePersonList=new ArrayList<>();
                result.put(person.getAge(),namePersonList);
            }
            namePersonList.add(person);
        }
        return result;


    }


}

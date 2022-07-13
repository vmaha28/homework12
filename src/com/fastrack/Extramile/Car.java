package com.fastrack.Extramile;

public class Car {
    //Car (name, age, km, price)
    public String name;
    public Integer age;
    public Integer km;
    public Integer price;

    public Car(String name, Integer age, Integer km, Integer price) {
        this.name = name;
        this.age = age;
        this.km = km;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getKm() {
        return km;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", km=" + km +
                ", price=" + price +
                '}';
    }
}

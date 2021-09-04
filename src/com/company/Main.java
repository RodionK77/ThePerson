package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        Person p = new Person();
        System.out.println("Введите возраст: ");
        while(true){
            age = sc.nextInt();
            if (age>p.getMaxAge()) {
                System.out.println("Введите корректный рост");
            }else{
                p.setAge(age);
                p.setValid(true);
                break;
            }
        }


        System.out.println("Имя - " + p.getName() + " Возраст - " + p.getAge() + " Рост - " + p.getHeight() + " Вес - " + p.getWeight());
        if(p.getValid()){
            System.out.println("Данные валидны");
        }else  System.out.println("Данные не валидны");

    }
}

class Person {
    int age;
    double height;
    int weight;
    String name;
    private final int maxAge = 200;
    private final double maxHeight = 3.2;
    private final int maxWeight = 500;
    boolean valid = false;

    Person(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        name = sc.nextLine();
        System.out.println("Введите рост: ");
        while(true){
            height = sc.nextDouble();
            if (height>getMaxHeight()) {
                System.out.println("Введите корректный рост");
            }else{
                break;
            }
        }
        System.out.println("Введите вес: ");
        while(true){
            weight = sc.nextInt();
            if (weight>getMaxWeight()){
                System.out.println("Введите корректный вес");
            }else{
                break;
            }
        }
    }

    public void setAge(int Age){
        age = Age;
    }

    public void setValid(boolean v){
        valid = v;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }
    public int getMaxAge(){
        return maxAge;
    }
    public double getMaxHeight(){
        return maxHeight;
    }
    public int getMaxWeight(){
        return maxWeight;
    }
    public boolean getValid(){
        return valid;
    }
}

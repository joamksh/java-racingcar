package controller;

import domain.Car;

import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {

        String name;
        int num;
        Scanner sc = new Scanner(System.in);
        Car car1 = new Car();

        System.out.println("input car's name");
        name = sc.next();
        car1.setName(name);

        System.out.println("input car's name");
        num = sc.nextInt();
        
        System.out.println("name : "+car1.getName());

    }


}


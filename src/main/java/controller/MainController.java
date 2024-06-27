package controller;

import domain.Car;

import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class MainController {

    public static void main(String[] args) {

        String name;
        int num;
        Scanner sc = new Scanner(System.in);
        Car car1 = new Car();

        System.out.println("input car's name");
        name = sc.next();
        car1.setName(name);

        System.out.println("input num");
        num = sc.nextInt();
        
        System.out.println("name : "+car1.getName());

        int randomNum = randomResult();
        if (randomNum >= 4)
            car1.addResult("-");
        System.out.println("random number: " + randomNum);
        System.out.println("result" + car1.getResult());

    }

    public static int randomResult() {
        Random random = new Random();
        return random.nextInt(10); // 0부터 9까지의 숫자 생성
    }

}


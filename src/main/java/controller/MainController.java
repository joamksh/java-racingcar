package controller;

import domain.Car;

import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class MainController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int carNum;
        int num;
        System.out.println("input Car's num");
        carNum=sc.nextInt();

        System.out.println("input num");
        num = sc.nextInt();

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < carNum; i++) {
            System.out.println("input car's name for car" + (i + 1));
            String name = sc.next();
            Car car = new Car();
            car.setName(name);
            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println("name : " + car.getName());

            for (int i = 0; i < num; i++) {
                int randomNum = randomResult();
                if (randomNum >= 4) {
                    car.addResult("-");
                }
                System.out.println(i + " random number: " + randomNum);
                System.out.println("result: " + car.getResult());
            }
        }

        System.out.println("Comparing results:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + (i + 1) + " (" + cars.get(i).getName() + ") result: " + cars.get(i).getResult());
        }


    }

    public static int randomResult() {
        Random random = new Random();
        return random.nextInt(10); // 0부터 9까지의 숫자 생성
    }

}


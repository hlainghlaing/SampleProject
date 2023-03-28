package com.scm.scannersample;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Restaurant item = new Restaurant();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name you want to eat!");
        item.setFoodName(sc.nextLine());
        System.out.println("Enter amount");
        int num = sc.nextInt();
        item.setNumber(num);

        System.out.println("Thanks for your help ");
        System.out.print("Wait for 3 minutes to get ");
        System.out.print(item.getNumber()+" "+item.getFoodName());
    }

}

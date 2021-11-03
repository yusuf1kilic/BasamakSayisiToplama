package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14




        System.out.print("lütfen bir sayı giriniz : ");
        int number= input.nextInt();
        int result=0,result2;

        while (number!=0){
            result2=number%10;
            result+=result2;
            number/=10;

        }
        System.out.println("Sayıların basamak toplamları : "+result);

    }
}

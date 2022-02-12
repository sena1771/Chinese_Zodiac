package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
 double total;
        Scanner input=new Scanner(System.in);
        System.out.print("Date of Birth: ");
        int date= input.nextInt();
        total=(date%12);
        System.out.println("Your Chinese Zodiac is: ");
        if (total==0){
            System.out.print("Monkey");
        }
        if(total==1){
            System.out.print("Rooster");
        }
        if(total==2){
            System.out.print("Dog");
        }
        if(total==3) {
            System.out.print("Pig");
        }
        if(total==4) {
            System.out.print("Rat");
        }
        if(total==5) {
            System.out.print("Ox");
        }
        if(total==6) {
            System.out.print("Tiger");
        }
        if(total==7) {
            System.out.print("Rabbit");
        }
        if(total==8) {
            System.out.print("Dragon");
        }
        if(total==9){
            System.out.print("Snake");
        }
        if(total==10) {
            System.out.print("Horse");
        }
        if(total==11) {
            System.out.print("Sheep");
        }

    }
}

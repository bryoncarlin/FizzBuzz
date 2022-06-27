package com.example.FizzBuzz;
import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int bee = scan.nextInt();
        if (bee % 3 == 0 && bee % 5 == 0){
            System.out.println("Fizzbuzz");
        }else if(bee % 3 == 0){
            System.out.print("Fizz");
        } else if (bee % 5 == 0) {
            System.out.println("Buzz");
        }else{
            System.out.println(bee);
        }
    }
}

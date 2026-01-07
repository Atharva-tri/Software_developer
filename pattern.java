/*
  Program: Print Pyramid Pattern
  Author: Sathivika Pittala
  Description: This Java code prints a pyramid pattern of asterisks.
*/



import java.util.*;

public class pattern {
    public static void main(String[] args){
        int n=5;

        for(int i=1;i<=n;i++){
           
            for(int space = 1; space <= n-i; space++){

                System.out.print(" ");

            }

            for(int start = 1; start<=(2*i-1); start++){
                System.out.print("*");
                
            }

            

            System.out.println();




        }


    }

}

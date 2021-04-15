package com.tts;

import java.util.ArrayList;
import java.util.*;

public class UserNum {
    public static void myNum() {
//    Create Array List
        ArrayList<Integer> integersList = new ArrayList<Integer>();
        Scanner inputDevice = new Scanner(System.in);
        int userNum;

//     Get numbers from user
        for(int i=0; i < 5; i++){
            System.out.println("Please enter 5 whole numbers: ");
            userNum = inputDevice.nextInt();

            integersList.add(userNum);
        }
//    Find the sum
        int sum = 0;
        for(Integer myInt : integersList){
            sum = sum + myInt;
        }
        System.out.println("The sum of your 5 numbers is: " + sum);

//       Find the product
        int product = 1;
        for(Integer myInt : integersList){
            product = product * myInt;
        }
        System.out.print("The product of your 5 numbers is: " + product);

//        Find the largest
        int largest = 0;
        for(Integer myInt : integersList){
            if(myInt > largest){
                largest = myInt;
            }
        }
        System.out.println("\nThe largest of your 5 numbers is: " + largest);

//        Find the smallest
        int smallest = largest;
        for(Integer myInt :  integersList){
            if(myInt < smallest){
                smallest = myInt;
            }
        }
        System.out.println("The smallest of your 5 numbers is: " + smallest);
        }
    }


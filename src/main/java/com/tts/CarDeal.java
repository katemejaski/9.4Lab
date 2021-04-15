package com.tts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarDeal {

    public static void carDealer(){
        HashMap<String, String> dealershipStock = new HashMap<String, String>();
        dealershipStock.put("Forester", "Subaru");
        dealershipStock.put("Model X", "Tesla");
        dealershipStock.put("GT3-RS", "Porsche");
        dealershipStock.put("Sierra", "GMC");
        dealershipStock.put("Silverado", "Chevrolet");
        dealershipStock.put("Suburban", "Chevrolet");
        dealershipStock.put("Wrangler", "Jeep");
        dealershipStock.put("Sentra", "Nissan");
        String customerInput;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("What model of car are you looking for?");
        customerInput = inputDevice.next();
        String searchStock = dealershipStock.get(customerInput);
        if(searchStock == null){
            System.out.println("Sorry, we don't have that model available.");
        } else {
            System.out.println("Great! You're looking for a " + customerInput + "? Here is our selection of " + dealershipStock.get(customerInput) + "s");
        }
        ArrayList<String> models = new ArrayList<String>();
        for (Map.Entry<String, String> entry : dealershipStock.entrySet()) {
            if (entry.getValue().equals(dealershipStock.get(customerInput))) {
                models.add(entry.getKey());
            }
        }
        String modelString = models.toString();
        System.out.println(modelString.replace("[","").replace("]","").replace(",", " "));
    }
}

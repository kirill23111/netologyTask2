package ru.netology.service;

public class CustomsService {
    private static final int TAX_PER_KG = 100;
    
    public static int calc(int price, int weight) {
        int result  = (price / 100) + (weight * TAX_PER_KG);
        return result;
    }
}

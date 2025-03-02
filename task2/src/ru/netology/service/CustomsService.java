package ru.netology.service;

public class CustomsService {
    public static int calc(int price, int weight) {
        int result  = (price / 100) + (weight * 100);
        return result;
    }
}

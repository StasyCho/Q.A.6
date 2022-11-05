package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {

        int lowerLimit = 200;
        int upperLimit = 300;

        SQRService Service = new SQRService();
        System.out.println(SQRService.calcSQR(lowerLimit, upperLimit));

    }
}


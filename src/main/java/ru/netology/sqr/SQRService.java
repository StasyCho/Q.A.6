package ru.netology.sqr;

public class SQRService {
    public static int calcSQR(int lowerLimit, int upperLimit) {
        int Number = 0;
        for (int i = 10; i <= 99; i++) {
            if (lowerLimit <= i * i && i * i <= upperLimit) {
                Number++;
            }
        }
        return Number;
    }
}



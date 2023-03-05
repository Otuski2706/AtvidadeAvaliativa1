package com.example.app_temperatura_versao3;

public class FahrenheitStrategy implements ConversorTemperatura{
    private static FahrenheitStrategy instance;

    public FahrenheitStrategy(){

    }

    public static FahrenheitStrategy getInstance() {
        if (instance == null) {
            instance = new FahrenheitStrategy();
        }
        return instance;
    }

    @Override
    public double getConversion(double temperatura) {
        double fah;

        fah = 1.8 * temperatura + 32;

        return fah;
    }
}
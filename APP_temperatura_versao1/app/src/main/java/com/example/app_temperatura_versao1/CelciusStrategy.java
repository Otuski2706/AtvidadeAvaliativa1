package com.example.app_temperatura_versao1;

public class CelciusStrategy implements ConversorTemperatura{
    private static CelciusStrategy instance;

    public CelciusStrategy(){

    }

    public static CelciusStrategy getInstance() {
        if (instance == null) {
            instance = new CelciusStrategy();
        }
        return instance;
    }

    @Override
    public double getConversion(double temperatura) {
        double cel;

        cel = (temperatura - 32)/ 1.8;

        return cel;
    }
}

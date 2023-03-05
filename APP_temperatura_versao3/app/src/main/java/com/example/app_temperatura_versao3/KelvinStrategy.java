package com.example.app_temperatura_versao3;

public class KelvinStrategy{
    private static KelvinStrategy instance;

    public KelvinStrategy(){

    }

    public static KelvinStrategy getInstance() {
        if (instance == null) {
            instance = new KelvinStrategy();
        }
        return instance;
    }

    public double getKelvinCelConvertion(double temperatura) {
        double kel;

        kel = temperatura + 273;

        return kel;
    }

    public double getKelvinFahConvertion(double temperatura) {
        double kel;

        kel = (temperatura - 32) * 5/9 +273;

        return kel;
    }
}


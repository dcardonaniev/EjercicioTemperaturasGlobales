package me.davidlake;

public class Main {
    public static void main(String[] args) {
        String[] cities = {
                "Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aires",
                "Asunción",
                "São Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio",
        };

        int[][] temperatures = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        String ciudadMenorTemperatura = cities[0], ciudadMayorTemperatura = cities[0];
        int menorTemperatura = temperatures[0][0], mayorTemperatura = temperatures[0][1];

        for(int i = 0; i < cities.length; i++) {
            if(temperatures[i][0] < menorTemperatura) {
                menorTemperatura = temperatures[i][0];
                ciudadMenorTemperatura = cities[i];
            }

            if(temperatures[i][1] > mayorTemperatura) {
                mayorTemperatura = temperatures[i][1];
                ciudadMayorTemperatura = cities[i];
            }
        }

        System.out.printf("Menor temperatura: %s, %d\n", ciudadMenorTemperatura, menorTemperatura);
        System.out.printf("Mayor temperatura: %s, %d\n", ciudadMayorTemperatura, mayorTemperatura);
    }
}
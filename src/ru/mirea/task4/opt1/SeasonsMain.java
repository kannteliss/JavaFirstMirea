package ru.mirea.task4.opt1;

public class SeasonsMain {
    public static void main(String[] args) {
        Seasons favoriteSeason = Seasons.Spring;
        System.out.println("Любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription());

        printSeasonMessage(favoriteSeason);

        for (Seasons season: Seasons.values()){
            System.out.printf("%s: Средняя температура = %d°C, описание = %s\n",
                    season, season.getAverageTemperature(), season.getDescription());
        }

    }

    public static void printSeasonMessage(Seasons season) {
        switch (season) {
            case Winter -> System.out.println("Я люблю зиму");
            case Spring -> System.out.println("Я люблю весну");
            case Summer -> System.out.println("Я люблю лето");
            case Autumn -> System.out.println("Я люблю осень");
        }
    }
}
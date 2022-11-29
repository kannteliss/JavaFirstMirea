package ru.mirea.task2.opt9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();
        List<String> deck = createDeck(); // Создание колоды карт
        Collections.shuffle(deck); // Перемешать колоду

        // Раздача карт игрокам
        for (int i = 1; i <= n; i++) {
            System.out.println("Игрок " + i + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println(deck.get(0));
                deck.remove(0);
            }
            System.out.println();
        }
        scanner.close();
    }

    //  Колода из 52 карт
    public static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"♥️", "♦️", "♣️", "♠️"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + suit);
            }
        }
        return deck;
    }
}

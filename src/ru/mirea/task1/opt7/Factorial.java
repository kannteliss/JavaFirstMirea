package ru.mirea.task1.opt7;

import java.util.Scanner;

public class Factorial {
    public static long factorial(int n){
        long res = 1;
        for (int i = 1; i <= n; i++){
            res *= i;
            }
            return  res;
    }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите число для которого нужно вычислить факториал (от 0 до 39): ");
            int num = scan.nextInt();
            if (num < 0){
                System.out.print("Нельзя вычислить факториал отрицательного числа");

            } else if (num>39) {
                System.out.println("Программа не может вычислить факториал этого числа");

            } else {
                long res = factorial(num);
                System.out.printf("Факториал %d равен: %d", num, res);
            }
        }
}


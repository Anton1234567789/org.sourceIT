package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Game {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void Generate()throws IOException {
        int randomNumber = (int) (Math.random() * 100);
        for (int i = 0; i < randomNumber; i++) {
            System.out.println("Введите число от 0 до 100: ");
            String s = reader.readLine();
            int number = Integer.parseInt(s);
            if (number > randomNumber) {
                System.out.println("Загаданное число меньше");
            }
            if (number < randomNumber) {
                System.out.println("Загаданное чисо больше");
            } else if (number == randomNumber) {
                System.out.print("Вы угадали!!! Это число: " + randomNumber);

                break;
            }
        }

    }


    public static void main(String[] args)throws Exception {
        Game game = new Game();

        game.Generate();
    }
}


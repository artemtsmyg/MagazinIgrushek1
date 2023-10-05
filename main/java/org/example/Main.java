package org.example;

import org.example.МагазинИгрушек1.ToyRaffle;

public class Main {
    public static void main(String[] args) {
        /**
         * Пример инициализации ToyRaffle с игрушками и их весами
         */
        String[] toyIds = {"toy1", "toy2", "toy3"};
        String[] toyNames = {"Игрушка 1", "Игрушка 2", "Игрушка 3"};
        int[] toyWeights = {1, 2, 3}; // Пример весов игрушек

        ToyRaffle toyRaffle = new ToyRaffle(toyIds, toyNames, toyWeights);

        /**
         * Выполняем розыгрыш игрушек
         */
        String winner = toyRaffle.drawToy();

        /**
         * Выводим результат розыгрыша
         */
        System.out.println("Выиграла игрушка с идентификатором: " + winner);
    }
}
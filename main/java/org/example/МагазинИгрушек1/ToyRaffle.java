package org.example.МагазинИгрушек1;

import java.util.PriorityQueue;

/**
 * Класс, представляющий розыгрыш игрушек в магазине.
 */
public class ToyRaffle {

    private final String[] toyIds;       // Массив идентификаторов игрушек
    private final String[] toyNames;     // Массив названий игрушек
    private final int[] toyWeights;      // Массив весов (частоты выпадения) игрушек
    private final PriorityQueue<String> raffleQueue; // Очередь с игрушками для розыгрыша

    /**
     * Конструктор класса ToyRaffle.
     *
     * @param toyIds       Массив идентификаторов игрушек.
     * @param toyNames     Массив названий игрушек.
     * @param toyWeights   Массив весов (частоты выпадения) игрушек.
     */
    public ToyRaffle(String[] toyIds, String[] toyNames, int[] toyWeights) {
        this.toyIds = toyIds;
        this.toyNames = toyNames;
        this.toyWeights = toyWeights;
        this.raffleQueue = new PriorityQueue<>();

        /**
         * Заполнение очереди игрушками на основе весов
         */
        for (int i = 0; i < toyIds.length; i++) {
            int weight = toyWeights[i];
            for (int j = 0; j < weight; j++) {
                raffleQueue.add(toyIds[i]);
            }
        }
    }

    /**
     * Выполняет розыгрыш игрушки.
     *
     * @return Идентификатор выигранной игрушки.
     */
    public String drawToy() {
        if (raffleQueue.isEmpty()) {
            return "Розыгрыш завершен. Все игрушки разыграны.";
        }
        return raffleQueue.poll();
    }
}
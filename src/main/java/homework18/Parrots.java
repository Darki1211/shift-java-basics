package main.java.homework18;

public class Parrots {
    public static void main(String[] args) {
        double boaHeightCm = 380.0;

        double parrotHeightCm = boaHeightCm / 38.0;
        double monkeyHeightCm = boaHeightCm / 5.0;
        double elephantHeightCm = boaHeightCm / 2.0;

        double totalHeightCm = boaHeightCm + parrotHeightCm + monkeyHeightCm + elephantHeightCm;

        System.out.println("Рост удава: " + (boaHeightCm / 100.0) + " м");
        System.out.println("Рост попугая: " + (parrotHeightCm / 100.0) + " м");
        System.out.println("Рост мартышки: " + (monkeyHeightCm / 100.0) + " м");
        System.out.println("Рост слонёнка: " + (elephantHeightCm / 100.0) + " м");
        System.out.println("Суммарный рост: " + (totalHeightCm / 100.0) + " м");
    }
}

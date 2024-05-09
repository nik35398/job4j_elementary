package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(11, 3, -9, -2);
        System.out.println("Result (11, 3) to (-9, -2) " + result);
    }
}
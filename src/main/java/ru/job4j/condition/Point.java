package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        int firstPoint = x2 - x1;
        int secondPoint = y2 - y1;
        double distancePoint = Math.pow(firstPoint, 2) + Math.pow(secondPoint, 2);
        double result = Math.sqrt(distancePoint);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(12, 3, -9, -2);
        System.out.println("Result (12, 3) to (-9, -2) " + result);
    }
}
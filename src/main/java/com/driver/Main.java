package com.driver;

public class Main {
    static class Product{

        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z){
            return x*y*z;
        }

        public double product(double x, double y){
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();

        System.out.println("First Result " + p.product( 2, 5));
        System.out.println("Second Result Overload(int) " + p.product(2, 5, 2));
        System.out.println("Third Result Overload(double) " + p.product(2.0, 5.0));
    }








}
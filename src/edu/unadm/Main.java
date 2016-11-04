package edu.unadm;

public class Main {

    public static void main(String[] args) {
        Product productOne = new Product();
        Client clientOne = new Client();

        clientOne.isPremium = true;
        clientOne.score = 120;

        productOne.price = 220;
        System.out.println("productOne.price = 220");
        System.out.println("productOne.price: " + String.valueOf(productOne.price));
        productOne.price *= 1.16;
        System.out.println("productOne.price *= 1.16");
        System.out.println("productOne.price: " + String.valueOf(productOne.price));
        System.out.println("======================= \n\n");

        double subtotal = 380;
        System.out.println("double subtotal = 380");
        System.out.println("subtotal: " + String.valueOf(subtotal));
        double total = clientOne.isPremium ? subtotal - 100 : subtotal;
        System.out.println("double total = clientOne.isPremium ? subtotal - 100 : subtotal");
        System.out.println("total: " + String.valueOf(total));
        System.out.println("clientOne.isPremium: " + String.valueOf(clientOne.isPremium));
        System.out.println("======================= \n\n");

        double shippingCost = subtotal >= 800 ? 0 : 120;
        System.out.println("double shippingCost = subtotal >= 800 ? 0 : 120");
        System.out.println("shippingCost: " + String.valueOf(shippingCost));
        System.out.println("subtotal >= 800: " + String.valueOf(subtotal >= 800));
        System.out.println("======================= \n\n");

        int orderReward = 20;
        clientOne.score += orderReward;
        System.out.println("clientOne.score += orderReward");
        System.out.println("orderReward: " + String.valueOf(orderReward));
        System.out.println("clientOne.score: " + String.valueOf(clientOne.score));
        System.out.println("======================= \n\n");

        boolean isDscount = clientOne.score >= 100 && clientOne.isPremium;
        System.out.println("boolean isDscount = clientOne.score >= 100 && clientOne.isPremium");
        System.out.println("clientOne.score >= 100: " + String.valueOf(clientOne.score >= 100));
        System.out.println("clientOne.isPremium: " + String.valueOf(clientOne.isPremium));
        System.out.println("isDscount: " + String.valueOf(isDscount));



    }

    public static class Product {
        public double price;
    }

    public static class Client {
        public int score;
        public boolean isPremium;
    }
}

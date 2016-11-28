package edu.unadm;

import java.util.Scanner;

public class Main {
    public static final int N_DATAS = 10;

    public static void main(String[] args) {

        System.out.println("==== DATABOX EA ====");
        System.out.println("==== ES1421004131 ====\n\n");
        DataBox dataBox = new DataBox(N_DATAS);
        dataBox.getInfo();
    }

    public static class DataBox {
        int sum = 0;
        float average;
        long product;

        DataBox(int nDatas) {
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < N_DATAS; i++) {
                System.out.format("%nIngrese el valor %d: ", i + 1);
                int dataIn = scanner.nextInt();
                sum += dataIn;
            }
            average = (float) sum / N_DATAS;
            int factor = sum > 5000 ? 3 : sum > 1000 ? 4 : 1;
            product = sum * factor;

            scanner.close();
        }

        public void getInfo() {
            System.out.format("%nSuma: %d%n" +
                    "Promedio: %.2f%n" +
                    "Producto: %d",
                    sum, average, product);
        }
    }

}

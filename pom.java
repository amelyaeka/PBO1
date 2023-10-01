import java.util.Scanner;

        public class Main {
        public static void main(String[] args) {
        // Variabel dan Tipe Data
        int angka = 5;
        double decimal = 3.14;
        char karakter = 'A';

        // For Loop
        System.out.print("Loop For: ");
        for (int i = 1; i <= 5; ++i) {
        System.out.print(i + " ");
        }
        System.out.println();

        // If Statement
        if (angka > 0) {
        System.out.println("Angka adalah bilangan positif.");
        } else {
        System.out.println("Angka adalah bilangan negatif atau nol.");
        }

        // While Loop
        System.out.print("Loop While: ");
        int counter = 1;
        while (counter <= 5) {
        System.out.print(counter + " ");
        counter++;
        }
        System.out.println();

        // Do-While Loop
        System.out.print("Loop Do-While: ");
        int i = 1;
        do {
        System.out.print(i + " ");
        i++;
        } while (i <= 5);
        System.out.println();

        // Array Satu Dimensi
        int[] arraySatuDimensi = {1, 2, 3, 4, 5};
        System.out.print("Array Satu Dimensi: ");
        for (int value : arraySatuDimensi) {
        System.out.print(value + " ");
        }
        System.out.println();

        // Array Multidimensi
        int[][] arrayMultiDimensi = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Array Multidimensi:");
        for (int row = 0; row < arrayMultiDimensi.length; ++row) {
        for (int col = 0; col < arrayMultiDimensi[0].length; ++col) {
        System.out.print(arrayMultiDimensi[row][col] + " ");
        }
        System.out.println();
        }

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int userInput = scanner.nextInt();
        System.out.println("Anda memasukkan: " + userInput);

        // Output
        System.out.println("Ini adalah contoh output.");

        // Comment
        // Ini adalah contoh komentar satu baris

        /*
        Ini adalah contoh komentar
        multi-baris
        */
         }
        }
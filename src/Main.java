import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] massiv = new int[n];
        System.out.println("Изначальный массив: ");
        for (int i = 0; i <massiv.length; i++) {
            massiv[i] = (int) (Math.random() * 15 + 5);
            System.out.print(massiv[i] + " ");
        }
        for (int i = 0; i < massiv.length; i++) {
            for (int j = i+1; j < massiv.length; j++) {
                if (massiv[i] > massiv[j]) {
                    massiv[i] = massiv[i] + massiv [j];
                    massiv[j] = massiv[i] - massiv [j];
                    massiv[i] = massiv[i] - massiv[j];
                }
            }
        }
        System.out.println();
        System.out.println("Отсортированный массив: ");
        for (int j : massiv) {
            System.out.print(j + " ");
        }
    }
}
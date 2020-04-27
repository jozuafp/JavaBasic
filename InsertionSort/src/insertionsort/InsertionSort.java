package insertionsort;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nomor = new int[20];
        int menu = 0, z = 0, temp;
        Scanner InputNum = new Scanner(System.in);
        while (menu != 4) {
            System.out.print("1.Input\n2.view\n3.Sort\n4.Exit\nPilihan: ");
            menu = InputNum.nextInt();
            switch (menu) {
                case 1:
                    z++;
                    System.out.print("Masukkan Nomor : ");
                    nomor[z] = InputNum.nextInt();
                    break;
                case 2:
                    if (z < 1) {
                        System.out.println("Kosong");
                    } else {
                        System.out.print("Data Sebelum Diurutkan : ");
                        for (int a = 1; a <= z; a++) {
                            System.out.print(nomor[a] + " ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    if (z < 1) {
                        System.out.println("Kosong");
                    } else {
                        for (int c = 1; c <= z; c++) {
                            System.out.print(nomor[c] + " ");
                        }
                        System.out.println("");
                        for (int a = 2; a <= z; a++) {
                            int b = a;
                            while (b > 1 && nomor[b - 1] > nomor[b]) {
                                temp = nomor[b];
                                nomor[b] = nomor[b - 1];
                                nomor[b - 1] = temp;
                                b--;
                                for (int c = 1; c <= z; c++) {
                                    System.out.print(nomor[c] + " ");
                                    if (c == a) {
                                        System.out.print("| ");
                                    }
                                }
                                System.out.println("");
                            }
                        }
                        System.out.print("Data Setelah Diurutkan : ");
                        for (int a = 1; a <= z; a++) {
                            System.out.print(nomor[a] + " ");
                        }
                        System.out.println("");
                        break;
                    }
                case 4:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Salah");
                    System.out.println("");
            }

        }

    }

}
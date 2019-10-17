package com.benno;
import java.util.Scanner;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menghitung Nilai Rata-Rata dengan menggunakan konsep OO
     */

public class Main {

    public static void main(String[] args) {
		RataRata mhs = new RataRata();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan Banyaknya Mahasiwa : ");
		mhs.setJmlMhs(scanner.nextInt());

		System.out.println("\nMaka, Rata-rata nilainya adalah : " + mhs.hitungRataRata());
		System.out.println("Developed by : Benno Alif Anggara");
    }
}

package com.benno;
import java.util.Scanner;

public class RataRata {
    Scanner input = new Scanner(System.in);

    private Integer jmlMhs;
    private double totalNilai;

    public void setJmlMhs(Integer jmlMhs) {
        this.jmlMhs = jmlMhs;
    }

    private double hitungNilai(){
        for( int i = 1; i <= jmlMhs; i++ ){
            System.out.print("Nilai mahasiswa ke-"+i+" : ");
            Double nilai = input.nextDouble();
            totalNilai += nilai;
        }
        return totalNilai;
    }

    public double hitungRataRata(){
        return hitungNilai() / jmlMhs;
    }
}

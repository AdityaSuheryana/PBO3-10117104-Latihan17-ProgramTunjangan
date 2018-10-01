/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * Nama      : Aditya Suheryana
 * Nim       : 10117104
 * Kelas     : IF-3 / PBO3
 * Deskripsi : User Menginput Gaji dan Status .
 *             Program Menampilkan Hasil gaji
 */
public class PBO310117104Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int gajiPokok;
    double tunjangan,total;
    String status; 
    
    Scanner scn = new Scanner(System.in);
    
    System.out.println("===============Program Tunjangan====================");
    System.out.print("Berapa Gaji Pokok anda Perbulan ? : Rp. ");
    gajiPokok=scn.nextInt();
    System.out.print("Status Anda ?(Menikah/Belum)      : ");

    status=scn.next();
    

    System.out.println("");
    System.out.println("===========Hasil Perhitungan Gaji Anda==============");
    System.out.println("Gaji Pokok : Rp. "+gajiPokok);
    tunjangan=("Menikah".equals(status))?0.35*gajiPokok:0;
    System.out.println("tunjangan  : Rp. "+tunjangan);
    total = gajiPokok + tunjangan;
    System.out.println("Total Gaji : Rp. "+total);
    System.out.println("(Developed by : Aditya Suheryana)");
    }
    
}

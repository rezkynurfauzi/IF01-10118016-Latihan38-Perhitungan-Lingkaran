/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan38.perhitungan.lingkaran;
import java.util.Scanner;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Menghitung Lingkaran
 */
public class IF0110118016Latihan38PerhitunganLingkaran {
    public static int diameter;
    public static double jari2;
    public static double keliling;
    public static double luas;

    public static void hitungKeliling() {
        keliling = 3.14 * diameter;
	}

    public static void hitungLuas() {
        luas = 3.14 * Math.pow(jari2, 2) ;
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //inisialisasi
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        String validasi;
                            
        //input
        do{
        System.out.print("Masukkan Nilai Diameter Lingkaran : ");
            validasi = scanner.nextLine();
        
        //logika dan output
        if (validasi.matches("[0-9]*")) {
            diameter = Integer.parseInt(validasi);
            jari2 = diameter / 2;
            hitungKeliling();
            hitungLuas();
            System.out.println("====HASIL PERHITUNGAN====");
            System.out.println("Jari-Jari Lingkaran\t= " + jari2 + " cm");
            System.out.printf("Luas Lingkaran\t\t= %.2f",luas);System.out.println(" cm");
            System.out.printf("Keliling Lingkaran\t= %.2f",keliling);System.out.println(" cm");
            valid = true;
            break;
            }else {
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.println();
                                }
                            }while(!valid);
    }
    
}

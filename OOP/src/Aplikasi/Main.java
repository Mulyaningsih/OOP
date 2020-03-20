/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasi;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        //membuat objek
        Mahasiswa mhs = new Mahasiswa();

        //memberi nilai atau value
        mhs.nim = "18090116";
        mhs.nama = "OKTAVIA DWI MULYANINGSIH";
        mhs.kelas = "4B";

        //memanggil data
        System.out.println("Nama    : "+mhs.nama);
        System.out.println("Kelas   : "+mhs.kelas);
        System.out.println("NIM     : "+mhs.nim);
    }
    
}

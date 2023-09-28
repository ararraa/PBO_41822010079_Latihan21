/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo2_41822010079_latihan21;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * Nama : Adjeng Rara Rengganis 
 * NIM  : 41822010079
 * Nama : Vanisha Putri Kania 
 * NIM  : 41822010082
 */
public class PBO2_41822010079_Latihan21 
{

    public static void main(String[] args) 
    {
        System.out.println("Format Tugas PBO");

        Scanner masuk = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        System.out.print ("Masukkan Banyaknya Mahasiswa: ");
        n = masuk.nextInt();
        jum=0;
        i=1;
        while (i<=n)
        {
                System.out.print ("Nilai Mahasiswa Ke-"+i+": ");
                x=masuk.nextFloat ();
                jum += x;
                i++;
        }
        rata = jum / n;
        System.out.println ("Maka, Rata-Rata Nilainya Adalah: "+rata);
       
    }
}

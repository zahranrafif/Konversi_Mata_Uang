/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.ran;

import java.text.DecimalFormat;

/**
 *
 * @author Zahran Rafif Pc
 */

public class serviceProcess {
    //Sudah Dikembangkan
    
    //method mata uang
    //tampilkonversi
    
    public String getMatauang2(double dolar, double yuan, double yen, double rupee, double baht){
        String konversi = " ";         
        double matauang = 0;
        String pilih = "yentorp";
        switch (pilih) {
            case "yuantorp":
                matauang = yuan*2237;
                konversi = "Konversi Yuan ke Rupiah = " + matauang + " Rupiah";
                break;
            case "dolartorp":
                matauang = dolar*14.320;
                konversi = "Konversi Dolar ke Rupiah = " + matauang + " Rupiah";
                break;
            case "yentorp":
                matauang = yen*126.16;
                konversi = "Konversi Yen ke Rupiah = " + matauang + " Rupiah";
                break;
            case "rupeetorp":
                matauang = rupee*192.85;
                konversi = "Konversi Rupee ke Rupiah = " + matauang + " Rupiah";
                break;
            case "bahttodolar":
                matauang = baht*0.031;
                konversi = "Konversi Baht ke Dolar = " + matauang + " Dolar";
                break;
            default:
                konversi = "Tidak ditemukan / salah nih";
                break;
        } 
        return konversi;
    }
    

    //tampilmahasiswa
    public static String mahasiswa(String Nama,String Nim ,String Angkatan,String Display){ 
        String cek,output;           
        if(Display.equals("Zahran Rafif")){
            cek = "INI LAPTOP SAYA";
        }else {
            cek = "Kamu siapa Wey?";          
        }  
        output=Nama + " " + Nim + " " + Angkatan + ", " + cek;
        return output;
    }   
    
}

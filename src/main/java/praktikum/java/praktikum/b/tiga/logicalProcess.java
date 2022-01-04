package praktikum.java.praktikum.b.tiga;
//import DecimalFormat
import java.text.DecimalFormat;

/**
 *
 * @author Zahran Rafif Pc
 */

//membuat atau proses nya disini
public class logicalProcess {
    
    public String getHello(){
        
        return "Hello World";
    }
    
    public int getJarak(int meter){
        
        //rumus itung
        int km = meter/1000;
        
        return km; 
    }
    
    //kalo ini double berarti harus diubah ke string
    public double getLuasPP(){
    
    double hasil = 5.000;
    
    //format
    String pattern = "#0.000";
    //membuat objek
    DecimalFormat formatdesimal = new DecimalFormat(pattern);
    
    //ini kalau output nya ke string
    String a = formatdesimal.format(hasil);
    
    //ini kalau output nya dijadiin double lagi
    double parsingnumber = Double.parseDouble(a);
    
    return parsingnumber;
    }
    
    //4 Konversi Mata Uang
    //Dikembangin lagi !!
    public String getMatauang(){
        
        String konversi = " ";
        double rp = 17500;
        double dolar = 100;
        double yuan = 35;
        double yen = 10000;
        double rupee = 50;
        
        String pattern = "#0.000";
        DecimalFormat formatdesimal = new DecimalFormat(pattern);
        double matauang = 0;
         
        String pilih = "yentorp"; // Untuk memilih
        switch (pilih) {
            case "yuantorp":
                matauang = yuan*2.237;
                konversi = "jumlah ringgit = " + matauang;
                break;
            case "dolartorp":
                matauang = dolar*14.320;
                konversi = "Jumlah rupiah = " + matauang;
                break;
            case "yentorp":
                matauang = yen*126.16;
                konversi = "jumlah yen = " + matauang;
                break;
            case "rupeetorp":
                matauang = rupee*192.85;
                konversi = "Jumlah rupiah = " + matauang;
                break;
            default:
                konversi = "tidak ditemukan / salah nih";
                break;
        }
        String a = formatdesimal.format(matauang);  
        double parsingnumber = Double.parseDouble(a);
        return konversi;
    }
}
   
   
    

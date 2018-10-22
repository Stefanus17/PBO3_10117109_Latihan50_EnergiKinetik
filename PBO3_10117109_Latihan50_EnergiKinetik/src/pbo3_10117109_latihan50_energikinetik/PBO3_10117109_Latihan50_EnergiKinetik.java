/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan50_energikinetik;

/**
 * Nama  : Stefanus Saputra 
 * NIM   : 10117109
 * Kelas : PBO3
 * Deskripsi Program : Program ini dibuat untuk mengetahui berapa energi kinetik
 * dan usaha yang dihasilkan dari data yang telah diinput
 */
public class PBO3_10117109_Latihan50_EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Energi objE = new Energi();
        objE.setMassa(0.145);
        objE.setKecepatan(25);
        System.out.println("Sebuah bola baseball dengan massa 145 g dilempar "
                + "dengan kecepatan 25 m/s");
        System.out.println("a. Berapakah Energi Kinetiknya ?");
        System.out.println("b. Berapakah usaha yang dilakukan pada bola untuk "
                + "mencapai kecepatan ini jika dimulai dari keadaan diam ?");
        System.out.println("");
        System.out.println("=====JAWABAN=====");
        System.out.println("a. Energi Kinetiknya Adalah "+objE.hitungEnergiKinetik()+" Joule");
        System.out.println("b. Usahanya adalah "+objE.hitungUsaha()+" Joule");
        System.out.println("");
        System.out.println("Jadi energi kinetik dan usahanya bernilai sama yaitu "
                + "sebesar 45.3125 Joule");
    }
    
}

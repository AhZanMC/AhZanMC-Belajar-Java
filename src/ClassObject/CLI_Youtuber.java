/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObject;

/**
 *
 * @author Fauzan
 */
public class CLI_Youtuber {
    public static void main(String[] args) {
        Youtuber ytbr = new Youtuber();

        ytbr.dataNamaCh("Lord Endo");
        ytbr.dataJmlSubs("964 rb subscriber");
        ytbr.dataKonten("Bagi-bagi seed MCPE, bahas update, dll");
        ytbr.dataVerifikasi("terverifikasi");

        System.out.println("------------------------------------");
        System.out.println("Data Youtuber");
        System.out.println("------------------------------------");
        System.out.println("Nama Channel   : " + ytbr.cetakNamaCH());
        System.out.println("Jumlah Subs    : " + ytbr.cetakJmlSubs());
        System.out.println("Konten         : " + ytbr.cetakKonten());
        System.out.println("Verifikasi     : " + ytbr.cetakVerifikasi());
        System.out.println("------------------------------------");
    }
}

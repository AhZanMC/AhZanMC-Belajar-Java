/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObject;

/**
 *
 * @author Fauzan
 */
public class Youtuber {
    String nama, jumlah_subs, konten, verifikasi;

    void dataNamaCh(String Nama){
        this.nama = Nama;
    }
    void dataJmlSubs(String jumlahSubs){
        this.jumlah_subs = jumlahSubs;
    }
    void dataKonten(String Konten){
        this.konten = Konten;
    }
    void dataVerifikasi(String Verifikasi){
        this.verifikasi = Verifikasi;
    }

    String cetakNamaCH(){
        return nama;
    }
    String cetakJmlSubs(){
        return jumlah_subs;
    }
    String cetakKonten(){
        return konten;
    }
    String cetakVerifikasi(){
        if ("terverifikasi".equalsIgnoreCase(verifikasi)) {
            return "Channel ini sudah terverifikasi (Dapet centang)";
        } else {
            return "Channel ini belum terverifikasi (Belum dapet centang)";
        }
    }
}
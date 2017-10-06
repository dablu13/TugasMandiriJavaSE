/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassJava;

import java.util.Date;

/**
 *
 * @author user
 */
public class dataTransaksi {

    private dataNasabah nasabah;
    private String nomorTransaksi; // wajib ada
    private double pinjaman; // wajib ada
    private double cicilanPerBulan; // dari rumus
    private int durasi; // wajib ada
    private Date jatuhTempo=new Date(); // dari rumus
    private double uangMuka=1000000; // wajib ada
    private double bungaPerTahun; //buat sendiri aja
    private String status = "Belum";

    public dataTransaksi(String nomorTransaksi, double pinjaman, int durasi, double uangMuka) {
        this.nomorTransaksi = nomorTransaksi;
        this.pinjaman = pinjaman;
        this.durasi = durasi;
        this.uangMuka = uangMuka;
        if (durasi < 12) {
            this.bungaPerTahun = 0.1;
        } else {
            this.bungaPerTahun = 0.05;
        }

    }

    public dataTransaksi() {
    }

    public String getNomorTransaksi() {
        return nomorTransaksi;
    }

    public void setNomorTransaksi(String nomorTransaksi) {
        this.nomorTransaksi = nomorTransaksi;
    }

    public double getPinjaman() {
        return pinjaman;
    }

    public void setPinjaman(double pinjaman) {
        this.pinjaman = pinjaman;
    }

    public double getCicilanPerBulan() {
        return hitungCicilanPerBulan();
    }

    public void setCicilanPerBulan(double cicilanPerBulan) {
        this.cicilanPerBulan = cicilanPerBulan;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public Date getJatuhTempo() {
        return jatuhTempo;
    }

    public void setJatuhTempo(Date jatuhTempo) {
        this.jatuhTempo = jatuhTempo;
    }

    public double getUangMuka() {
        return uangMuka;
    }

    public void setUangMuka(double uangMuka) {
        this.uangMuka = uangMuka;
    }

    public double getBungaPerTahun() {
        return bungaPerTahun;
    }

    public void setBungaPerTahun(double bungaPerTahun) {
        this.bungaPerTahun = bungaPerTahun;
    }

    private double hitungPokokCicilan() {
        return pinjaman - uangMuka;
    }

    private double hitungBungaPerBulan() {
        double lKredit = durasi;
        double penampungNilaiLKreditBagi12 = lKredit / 12.0;
        return penampungNilaiLKreditBagi12 * hitungPokokCicilan() * bungaPerTahun;
    }

    private double hitungCicilanPerBulan() {
        double lKredit = durasi;
        return hitungBungaPerBulan() + (hitungPokokCicilan() / lKredit);
    }
    @SuppressWarnings("Unused")
    private double hitungGajiDiBagiTanggungan(double gajiPokok, double tanggungan) {
        return gajiPokok / (tanggungan + 1);
    }

    public dataNasabah getNasabah() {
        return nasabah;
    }

    public void setNasabah(dataNasabah nasabah) {
        this.nasabah = nasabah;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String tentukanNamaTransaksi() {
        char penentu = nomorTransaksi.toUpperCase().charAt(0);
        switch (penentu) {
            case 'A':
                return "Pinjaman";
                
            case 'B':
                return "Gadai";
                
            default:
                break;
        }
        return null;
    }
}

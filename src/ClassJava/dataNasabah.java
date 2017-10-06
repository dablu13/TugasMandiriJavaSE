/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassJava;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public class dataNasabah {
    private String id;
    private String nama;
    private String alamat;
    private Date tanggalLahir;
    private String jenisKelamin;
    private String status;
    private int jumlahTanggungan;
    private double gaji;
    private String nomorTelepon;
    private String nomorHp;
    private String email;
    private List<dataTransaksi> dt=new ArrayList<>();

    public dataNasabah(String id, String nama, String alamat, Date tanggalLahir, String jenisKelamin, String status, int jumlahTanggungan, double gaji, String nomorTelepon, String nomorHp, String email) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.status = status;
        this.jumlahTanggungan = jumlahTanggungan;
        this.gaji = gaji;
        this.nomorTelepon = nomorTelepon;
        this.nomorHp = nomorHp;
        this.email = email;
    }

    public dataNasabah() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getJumlahTanggungan() {
        return jumlahTanggungan;
    }

    public void setJumlahTanggungan(int jumlahTanggungan) {
        this.jumlahTanggungan = jumlahTanggungan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<dataTransaksi> getDt() {
        return dt;
    }

    public void setDt(List<dataTransaksi> dt) {
        this.dt = dt;
    }

    
}

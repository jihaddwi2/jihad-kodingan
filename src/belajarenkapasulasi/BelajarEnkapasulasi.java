/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarenkapasulasi;

class BelajarEnkapasulasi {
    //private digunakan suppaya objek tidak diakses sembarangan
    private String nama;    
    private String hobby;
    //Overload parameter Constructor
    public BelajarEnkapasulasi(String nama, String hobby) {
        this.nama = nama;
        this.hobby = hobby;
    }
    public String tampilkanNama() {
        return nama;
    }
    public String tampilkanHobby() {
        return hobby;
    }
    public void usia(int usia) {
        System.out.println("Usia \t\t: " + usia);
    }
    public void JK(String jk) {
        System.out.println("Jenis Kelamin \t: " + jk);
    }
}

class main {
    public static void main(String[] args) {
        System.out.println("=== Biodata Anggota Kelompok 1 ===");
        System.out.println("");
        //Objek 1
        BelajarEnkapasulasi dini = new BelajarEnkapasulasi("Dini Hari", "Berenang");
        System.out.println("Nama Anggota 1 \t: " + dini.tampilkanNama());
        System.out.println("Hobby \t\t: " + dini.tampilkanHobby());
        dini.usia(16);
        dini.JK("Perempuan");
        System.out.println();
        //Objek 2
        BelajarEnkapasulasi joko = new BelajarEnkapasulasi("Joko Tolle", "Futsal");
        System.out.println("Nama Anggota 2 \t: " + joko.tampilkanNama());
        System.out.println("Hobby \t\t: " + joko.tampilkanHobby());
        joko.usia(17);
        joko.JK("Laki-laki");
        System.out.println();
        System.out.println("====== Makacih yaaaa =====");
    }
} 

//
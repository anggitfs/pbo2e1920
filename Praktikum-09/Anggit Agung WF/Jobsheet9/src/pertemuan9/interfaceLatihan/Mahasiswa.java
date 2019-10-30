/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.interfaceLatihan;

/**
 *
 * @author asus
 */
public class Mahasiswa implements ICumlaude{
    private String nama;
    
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    public void kuliahDiKampus(){
        System.out.println("Aku Mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di Kampus.");
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah Menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
}

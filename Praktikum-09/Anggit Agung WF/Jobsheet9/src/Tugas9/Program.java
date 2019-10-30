/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas9;

/**
 *
 * @author asus
 */
public class Program {
    public static void main(String[] args) {
        Sepeda spd = new Sepeda();
        System.out.println("=======SEPEDA========");
        spd.ubahgear(10);
        spd.tambahKecepatan(100);
        spd.rem(50);
        spd.info();
        System.out.println(" ");
        
        SepedaMotor spdm = new SepedaMotor();
        System.out.println("=======SEPEDA MOTOR========");
        spdm.ubahgear(5);
        spdm.tambahKecepatan(100);
        spdm.rem(50);
        spdm.info();
        System.out.println(" ");
        
        Mobil mbl = new Mobil();
        System.out.println("=======MOBIL========");
        mbl.ubahgear(5);
        mbl.tambahKecepatan(100);
        mbl.rem(50);
        mbl.info();
        System.out.println(" ");
    }
}

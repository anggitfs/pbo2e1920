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
public class Sepeda implements IKendaraan{
    int kecepatan;
    int gear;

    @Override
    public void ubahgear(int gear) { this.gear = gear;
    }

    @Override
    public void tambahKecepatan(int kecepatan) { this.kecepatan += kecepatan;
    }

    @Override
    public void rem(int kecepatan) { this.kecepatan -= kecepatan;
    }

    @Override
    public void info() {
    System.out.println("Kecepatan Sepeda "+ kecepatan); System.out.println("Gear Sepeda "+ gear);
    }

}

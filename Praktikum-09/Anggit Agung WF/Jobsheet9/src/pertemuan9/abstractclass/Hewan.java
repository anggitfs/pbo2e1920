/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.abstractclass;

/**
 *
 * @author asus
 */
public abstract class Hewan {
    private int umur;
    
    Hewan(){
     this.umur = 0;   
    }
    public void bertambahUmur(){
        this.umur +=1;
    }
    public abstract void bergerak();
}

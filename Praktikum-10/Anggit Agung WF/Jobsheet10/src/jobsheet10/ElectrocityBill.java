/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author asus
 */
public class ElectrocityBill implements Payable{
    private int kwh;
    private String category;
    
    public ElectrocityBill(int kwh, String category){
        this.kwh = kwh;
        this.category = category;
    }
    public int getKwh(){
        return kwh;
    }
    public void setKwh(int kwh){
        this.kwh = kwh;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

    @Override
    public int getPaymentAmount() {
        return kwh+getBasePrice();
    }
    public int getBasePrice(){
        int bPrice = 0;
        switch(category){
            case "R-1" : bPrice = 100;break;
            case "R-2" : bPrice = 200;break;
        }
        return bPrice;
    }
    public String getBillInfo(){
        return "kwH = "+ kwh + "\n"+
                "Category = "+ category + "("+getBasePrice()+" per kwH)\n";
    }
}

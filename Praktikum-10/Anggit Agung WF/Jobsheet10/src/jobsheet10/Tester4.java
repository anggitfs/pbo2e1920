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
public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectrocityBill eBill = new ElectrocityBill(5, "R-1");
        ow.pay(eBill);//pay for electricity bill
        System.out.println("--------------------");
        
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp);//pay permanent employee
        System.out.println("------------------------");
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp);//show permanent employee info
        System.out.println("------------------------");
        ow.showMyEmployee(iEmp);//show internship employee
    }
}

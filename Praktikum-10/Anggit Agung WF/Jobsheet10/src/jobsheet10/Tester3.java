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
public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectrocityBill eBill = new ElectrocityBill(5, "A-1");
        Employee e[] = {pEmp, iEmp};
        Payable p[]= {pEmp,eBill};
        //Employee e2[]= {pEmp, iEmp, eBill};
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet02;

/**
 *
 * @author WINDOWS
 */
public class Bus {
    private int penumpang;
private int maxPenumpang;
private int penumpangBaru;
//konstruksi kelas Bus
public Bus(int maxPenumpang){
this.maxPenumpang = maxPenumpang;
penumpang =0;
}
//method mutator untuk menambahkan penumpang
public void addPenumpang(int penumpang){
int temp;
temp =this.penumpang+penumpang;
if(temp >= maxPenumpang){
System.out.println("Penumpang melebihi kuota");
}else{
this.penumpang = temp;
}
}
//minta password
public void getPenumpang(int password){
if (password==123){
System.out.println("\nPassword Benar");
addPenumpang(15);
}
else{
System.out.println("\nPassword Salah!!!");
}
}
public void cetak(){
System.out.println("Penumpang Bus sekarang adalah"+penumpang);
System.out.println("Penumpang maksimum seharusnya adalah "+maxPenumpang);
}
}

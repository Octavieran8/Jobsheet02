/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author WINDOWS
 */
public class UjiBus {
  public static void main(String[] args) {
      //membuat objek busMini dari kelas Bus
      Bus busMini = new Bus();
      //memasukkan nilai jumlah penumpang dan penumpang maksimal ke
      //dalam objek busMini
      busMini.penumpang = 5;
      busMini.maxPenumpang = 15;
      //memanggil method cetak pada kelas Bus
      busMini.cetak();
      //menambahkan jumlah penumpang pada busMini
      busMini.penumpang = busMini.penumpang + 5;
      busMini.cetak();
      //mengurangi jumlah penumpang pada busMini
      busMini.penumpang = busMini.penumpang - 2;
      busMini.cetak();
      //menambahkan jumlah penumpang pada busMini
      busMini.penumpang = busMini.penumpang + 8;
      busMini.cetak();
  }  
}

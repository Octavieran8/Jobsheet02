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
public class PraktikumUjiBus {
    public static void main (String[] args){
int password;
//membuat objek busBesar dari class Bus
 PraktikumBus busBesar =new PraktikumBus(40);
 busBesar.cetak();
//penambahan penumpang
 busBesar.getPenumpang(123);
 busBesar.cetak();
//penambahan penumpang
 busBesar.getPenumpang(121);
 busBesar.cetak();
//penambahan penumpang
 busBesar.getPenumpang(123);
 busBesar.cetak();
}
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author WINDOWS
 */
public class UjiBus3 {
    public static void main(String[] abc)
    {
    Bus3 Uji = new Bus3(5);
        Uji.getpenumpang(17);
        Uji.getpenumpang(24);
        Uji.cetakpenumpang();
        // penambahan penumpang
        Uji.addpenumpang (2); // tambah 2 penumpang
        Uji.cetakpenumpang();
        // penambahan penumpang
        Uji.addpenumpang (1); //tambah 1 penumpang
        Uji.cetakpenumpang();
        // penambahan penumpang
        Uji.addpenumpang (2); // tambah 2 penumpang
        Uji.cetakpenumpang();
        // penambahan penumpang
        Uji.addpenumpang (2); // tambah 2 penumpang
        Uji.cetakpenumpang();
    }
}

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
public class TestOctaviera {
    public static void main(String args[]) {
        OctavieraNanda biodata = new OctavieraNanda();
        biodata.setnamaAyah("Papa");
        biodata.setnamaIbu("Mama");
        biodata.setnamaSendiri("Nanda");
        biodata.setnamaSaudara("Azzam");
        biodata.setalamat("Lesanpuro");
        biodata.sethobi("Makan");
        biodata.setcitacita("Pegawai perusahaan besar");
        biodata.setumur(16);
        
        System.out.println("Nama Ayah : " + biodata.getnamaAyah()); 
        System.out.println("Nama Ibu : " + biodata.getnamaIbu()); 
        System.out.println("Nama Sendiri : " + biodata.getnamaSendiri());
        System.out.println("Nama Saudara : " + biodata.getnamaSaudara());
        System.out.println("Alamat : " + biodata.getalamat());
        System.out.println("Hobi : " + biodata.gethobi());
        System.out.println("Cita-Cita : " + biodata.getcitacita()); 
        System.out.println("Umur : " + biodata.getumur());
    }
}

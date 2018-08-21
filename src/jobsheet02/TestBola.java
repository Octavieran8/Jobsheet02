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
public class TestBola {
    public static void main(String[]args){
double Jarijari=14;
Bola objekbola=new Bola(7);
objekbola.showDiameter();
objekbola.showLuasPermukaan();
objekbola.showVolume();
System.out.println("\n\n");
objekbola.setJarijari(Jarijari); //manipulasi dengan variabel jari-jari yang dibuat
objekbola.showDiameter();
objekbola.showLuasPermukaan();
objekbola.showVolume();
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TebakAngka;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maulia
 */
public class game {
    
    Random rnd = new Random();
    int n = rnd.nextInt(100);
    
    void input() {
        int jwb;
        Scanner yn = new Scanner(System.in);
        int angka = 0;
        do{
            angka++;
            System.out.println("");
            System.out.println("Masukan Tebakan Anda");
            jwb = yn.nextInt();
            if(jwb>n) {
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            } else if(jwb<n){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            } else {
                System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
            }
        }while(jwb!=n);
        
    }
}

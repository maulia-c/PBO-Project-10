/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoras;

import java.util.Scanner;

/**
 *
 * @author Maulia
 */
public class cektriple1 {
    double a,b,c;

    void one() {
        Scanner real = new Scanner(System.in);
        System.out.println("Masukan Sisi Alas = ");
        a = real.nextDouble();
        System.out.println("Masukan Sisi Tinggi = ");
        b = real.nextDouble();
        System.out.println("Masukan Sisi Miring = ");
        c = real.nextDouble();

        double sisic,sisiab;
        sisic = c*c;
        sisiab = (a*a) + (b*b);

        if (sisiab == sisic) {
            System.out.println("ini beneran pythagoras");
        } else {
            System.out.println("ini bukan pythagoras");
        }
    }
    
}

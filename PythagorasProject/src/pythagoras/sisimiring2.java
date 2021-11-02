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
public class sisimiring2 {
    double x,y;
    
    void two() {
        Scanner SM = new Scanner(System.in);
        System.out.println("Masukan Sisi A = ");
        x = SM.nextDouble();
        System.out.println("Masukan Sisi B = ");
        y = SM.nextDouble();

        HitungSM miring = new HitungSM();
        miring.a = x;
        miring.b = y;

        System.out.println("Sisi Miring Segitiga = " + miring.HitungSM());
    }
    
}

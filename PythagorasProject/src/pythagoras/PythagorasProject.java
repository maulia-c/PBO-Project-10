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
public class PythagorasProject {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int inp;
        double a,b,c,d,e,f,x,y;
        System.out.println("---- Program Pythagoras ----");
        System.out.println("1.Cek triple pythagoras");
        System.out.println("2.Menentukan sisi miring segitiga");
        System.out.println("3.Menentukan sisi siku-siku segitiga");
        System.out.println("4.Exit");
        
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Pilih Program (nomer) : ");
        inp = input.nextInt();
        
        switch (inp) {
            case 1:
                cektriple1 r = new cektriple1 ();
                r.one();
                break;
                
            case 2:
                sisimiring2 p = new sisimiring2 ();
                p.two();
                break;
                
            case 3:
                siku3 q = new siku3();
                q.three();
                break;
                
            case 4:
                System.exit(0);
        }
    }
}

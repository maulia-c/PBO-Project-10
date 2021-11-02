/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoras;

/**
 *
 * @author Maulia
 */
public class HitungSM {
    double sisic,miring,a,b;
    
    double HitungSM(){
        sisic = (a*a) + (b*b);
        miring = (Math.sqrt(sisic));
        return miring;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccardluhn;

/**
 *
 * @author PsY
 */
public class CCardLuhn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LuhnAlg la = new LuhnAlg();
        int[] card = {4,6,5,8,5,8,3,5,5,3,3,5,6,1,0,8};
        //int[] card = {4,6,5,8,5,8,3,5,1,2,3,1,2,3,4,5,6,7,2};
        //int[] card = {4,9,1,7,6,1,0,0,0,0,0,0,0,0,0,0};
        //System.out.println(card.length);
        System.out.println("\nIs card valid: " + la.checkCard(card));
    }
    
}

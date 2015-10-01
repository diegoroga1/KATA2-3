/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generichistogram;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class GenericHistogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Integer[] vector = { 1,2,3,1,1,1,1,1,1,1,2,2,2,2,2,3,3,4,4,5,6,7,8,9,5,4,3,2};
        String[] vector1 = {"Ana","Pepe","Ana","Juan","Maria","Maria"};
        
        Histogram<Integer> histogram = CalculaHistrogram.computeHisto(vector);
        for(Object key : histogram.keySet()){
            System.out.println(key +" : "+ histogram.get(key));
        }
        
        HashMap<Object,Integer> histogram = histo.getHisto();
        
    }
}

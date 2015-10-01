/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generichistogram;

/**
 *
 * @author usuario
 */
public class CalculaHistrogram <T> {
    
    public static <T> Histogram <T> computeHisto(T [] vector){
        Histogram <T> histo = new Histogram<>();
        for(T t : vector){
            histo.increment(t);
        }
        return histo;
        
    }
    
}

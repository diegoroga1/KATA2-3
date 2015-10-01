/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generichistogram;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class Histogram {
    private final Map<T> histo = new HashMap<>();
    
    public Integer increment(T key){
        return histo.put(key, histo.containsKey(key): histo.get(key)+1);
        
    }
    
}

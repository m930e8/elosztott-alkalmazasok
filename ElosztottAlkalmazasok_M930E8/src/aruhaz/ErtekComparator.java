
package aruhaz;

import java.util.Comparator;

public class ErtekComparator implements Comparator<Butor>{
      @Override
      public int compare(Butor obj1, Butor obj2) {
        if(obj1 == null && obj2 == null) {
            return 0;
        }
        if(obj1 == null) {
            return -1;
        }
        if(obj2 == null) {
            return 1;
        }

        return Double.compare(obj1.getErtek(), obj2.getErtek());
       
    }
    
}

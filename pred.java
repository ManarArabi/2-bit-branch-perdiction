
package pred;

/**
 *
 * @author manar
 */
public class Pred {

   
    public static void main(String[] args) {
        prediction pred = new prediction () ; 
        String x = pred.predict();
        System.out.print (x) ; 
        System.out.println ("   "+pred.state); 
        pred.update_state("T");
        x = pred.predict();
        System.out.print (x) ; 
        System.out.println ("   "+pred.state); 
        pred.update_state("T");
        x = pred.predict();
        System.out.print (x) ; 
        System.out.println ("   "+pred.state); 
        pred.update_state("NT");
        x = pred.predict();
        System.out.print (x) ; 
        System.out.println ("   "+pred.state); 
        pred.update_state("T");
        x = pred.predict();
        System.out.print (x) ; 
        System.out.println ("   "+pred.state); 
        pred.update_state("T");
        x = pred.predict();
        System.out.print (x) ; 
        System.out.println ("   "+pred.state); 
        pred.update_state("NT");
        x = pred.predict();
        System.out.print (x) ; 
        System.out.println ("   "+pred.state); 
        pred.update_state("NT");
        x = pred.predict();
        System.out.print (x) ; 
        System.out.println ("   "+pred.state); 
        pred.update_state("T");
        x = pred.predict();
        System.out.print (x) ; 
        System.out.println ("   "+pred.state); 
        pred.update_state("NT");
        x = pred.predict();
        System.out.print (x) ; 
        System.out.println ("   "+pred.state); 
        pred.update_state("T");
        x = pred.predict();
        System.out.print (x) ; 
        System.out.println ("   "+pred.state); 
        pred.update_state("T");
    }
    
}
/* output : 
NT   00
NT   01
T   10
NT   01
T   10
T   11
T   10
NT   01
T   10
NT   01
T   10
*/

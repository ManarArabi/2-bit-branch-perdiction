
package pred;

/**
 *
 * @author manar
 */
public class prediction {
    public String state ; //00 , 01 , 10 , 11 
    prediction ()
    {
        state = "00"; // strong not taken , it's prefered to start with strong state 
    }
    String predict ()
    {
        switch (state)
        {
            case "00" : case "01" : 
                return "NT"; 
            case "11" : case "10" :
                return "T";
            default : 
                return "invalid" ; // code must handle this and this case won't be reached
        }
    }
    void update_state(String curr) //curr what actually happen (0 for not taken , 1 for taken) (char) 
    {
        int num0 = Integer.parseInt(state, 2);
        int sum = num0;
        if ("T".equals(curr))
            sum += 1;
        else 
            sum -= 1; 
        if (sum>4) sum=4; 
        else if (sum<0) sum=0; 
        state =  Integer.toBinaryString(sum);
        for(int n=state.length(); n<2; n++) {
            state = "0" + state ; 
        }
    }
}

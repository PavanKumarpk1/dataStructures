/*BrackTracking:
 *  Basically  you will be calling a function everytime to get a 
 * unique ans, also considering number of possibilites available 
 * to certain answers
 * TC: 0(n*n!)
 * Eg: ABC string is backtracked to get all possible permutations
 */

public class Backtracking {
    public static void printPermutation(String str, String perm, int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }

        for(int i=0; i<str.length();i++){
            char current = str.charAt(i);
            String newStr = str.substring(0, i)+ str.substring(i+1);
            
            //System.out.println(newStr);
            printPermutation(newStr, perm+current, idx+1);
        }
    }

    public static void main(String[] args){
        String x = "ABC";
        printPermutation(x, "", 0) ;
    }
    
}

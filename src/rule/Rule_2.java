package rule;
import java.util.Arrays;

public class Rule_2 {
 
    public static void main(String[] args) {
        
    }

    public static boolean checkDuplication(int[] arr){
        Arrays.sort(arr); // O(N Log N) == O(N + Log N)

        // looping ini O(N)
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1] ) return true;
        }

        // O(N + Log N) vs O(N)
        // hasilnya O(N + Log N)
        // jadi pada method ini complexity nya adalah O(N Log N)

        return false;
    }

}

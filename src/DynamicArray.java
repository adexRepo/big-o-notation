import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    
    public static void main(String[] args) {
        
        List<Integer> listInt = new ArrayList<>(1); 
                           // * |   insert   |  Capacity |Resize     | Cost      |          
        // initial.listInt // * |    init    |     1     |           |   O(1)    |
        listInt.add(1);  // * |      1     |     1     |           |   O(1)    |
        listInt.add(2);  // * |      2     |  +1 => 2  |           |   O(2N)   | 2 karena 1 * 2
        listInt.add(3);  // * |      3     |  +2 => 4  |           |   O(2N)   | 2 karena 2 * 2
        listInt.add(4);  // * |      4     |     4     |           |   O(1)    |
        listInt.add(5);  // * |      5     |  +4 => 8  |           |   O(2N)   | 2 karena 4 * 2
        listInt.add(6);  // * |      6     |     8     |           |   O(1)    |
        listInt.add(7);  // * |      7     |     8     |           |   O(1)    |
        listInt.add(8);  // * |      8     |     8     |           |   O(1)    |
        listInt.add(9);  // * |      9     |  +8 => 16 |           |   O(2N)   | 2 karena 8 * 2
        listInt.add(10); // * |     10     |    16     |           |   O(1)    |
                           // * | Worst Cost |  O(2N)    |Amortize   |   O(1)    |

        /* 
         * jadi kesimpulannya 
         * worst cost = O(2N) menjadi O(N) >> rule 1
         * amortized  = O(1)
         */

    }

}

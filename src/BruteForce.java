import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BruteForce {

    public static void main(String[] args) {

        int[] arrNotDuplicate = { 1, 2, 4, 5, 3, 6, 7, 9 };
        boolean isDuplicate1 = checkDuplication3(arrNotDuplicate);
        System.out.println(" is duplicate false | real : " + isDuplicate1);

        int[] arrDuplicate = { 1, 3, 4, 5, 2, 3, 2 };
        boolean isDuplicate2 = checkDuplication3(arrDuplicate);
        System.out.println(" is duplicate true | real : " + isDuplicate2);

    }

    /* ----------------- Brute force - tidak efisien but efektif ---------------- */
    // *- Sangat mudah diterapkan
    // *- Tidak berarti buruk
    // *- Langkah awal untuk mengoptimalkan program
    // *- Time complexity O(N^2)
    /* --------------------------------- O(n^2) --------------------------------- */
    public static boolean checkDuplication1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    /* ------------ Optimaze 1 - Pertukaran time dan space complexity ----------- */
    // *- Extra space bisa mempercepat runtime
    // *- menggunakan Hash table
    // *- Time complexity O(N)
    // *- Space complexity O(N)
    /* ---------------------------------- O(n) ---------------------------------- */
    public static boolean checkDuplication2(int[] arr) {
        // memory extra
        Set<Integer> sets = new HashSet<>();
        for (Integer i : arr) {
            if (sets.contains(i)) {
                return true;
            }
            sets.add(i);
        }

        return false;
    }

    /* --------------- Optimize 2 - Negoisasi dan kebutuhan proses -------------- */
    // *- Bertanya kebutuhan dan batasan
    // *- Menggunakan Sorting
    // *- Time complexity O(N Log N)
    /* ------------------------------- O(N log N) ------------------------------- */
    public static boolean checkDuplication3(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                return true;
        }

        return false;
    }

}

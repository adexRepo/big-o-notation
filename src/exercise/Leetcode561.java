package exercise;

import java.util.Arrays;

public class Leetcode561 {

    /*
     * Diketahui jumlah array integer dari 2n integers, kelompokkan integers ini
     * menjadi n dengan pasangan (A1,B1), (A2,B2), ... (An,Bn) sedemikian rupa
     * sehingga jumlah dari min (Ai,Bi) untuk semua i dimaksimalkan.
     * kembalikan jumlah yang dimaksimalkan.
     * 
     */

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6};
        int res = arrayPairSum(nums); 
        System.out.println("res: " + res);

    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // O(N log N)
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i += 2) { // O(N/2) karena i += 2
            sum += nums[i];
        }

        // compare O(N Log N) vs O(N/2) maka O(N Log N) dominan 

        return sum;
    }

}

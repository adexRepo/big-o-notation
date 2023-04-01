package exercise;

import java.util.ArrayList;
import java.util.List;

public class Leetcode412 {
    
    /* 
     * Diberikan integer n, kembalikan jawaban array String, dimana
     * - arr[i] = "FizzBuzz" jika i habis dibai 3 dan 5
     * - arr[i] = "Fizz" jika i habis dibagi 3
     * - arr[i] = "Buzz" jika i habis dibagi 5
     * - arr[i] == i jika tidak ada kondisi diatas yang benar
     */

    public static void main(String[] args) {
        
        int[] nums ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        List<String> arrResult = fizzBuzz(nums);

        for (String str : arrResult) {
            System.out.println("str: " + str);
        }

    }

    public static List<String> fizzBuzz(int[] nums){
        List<String> resArr = new ArrayList<>();

        for (int i : nums) { // O(N)
            if(i % 3 == 0 && i % 5 == 0 ){ // O(1)
                resArr.add("FizzBuzz");
            }else if(i % 3 == 0 ){ // O(1)
                resArr.add("Fizz");
            }else if(i % 3 == 0 ){ // O(1)
                resArr.add("Buzz");
            }else {
                resArr.add(i+"");
            }
        }

        // result  == O(N)
        return resArr;

    }
}

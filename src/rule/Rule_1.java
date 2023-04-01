package rule;
public class Rule_1 {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        
        Rule_1.findMinAndMax(arr);

    }

    public static Pair<Integer,Integer> findMinAndMax(int[] arr){

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        // find max O(N)
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }

        // find min O(N)
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }

        // total nya O(N) + O(N) = O(2N)
        // secara complexity = O(N) , constant dihilangkan

        return new Pair<>(min,max);
    }


    public static class Pair<x,y>{

        Pair(Integer min, Integer max){
            System.out.println("max: " + max);
            System.out.println("min: " + min);
        }
    }

}

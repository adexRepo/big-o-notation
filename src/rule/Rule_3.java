package rule;

public class Rule_3 {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6 };

        Rule_3.findMinAndMax(arr1,arr2);

    }

    public static Pair<Integer, Integer> findMinAndMax(int[] arrMin, int[] arrMax) {

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
        // find min O(M)
        for (int i = 0; i < arrMin.length; i++) {
            if (arrMin[i] < min)
                min = arrMin[i];
        }

        // find max O(N)
        for (int i = 0; i < arrMax.length; i++) {
            if (arrMax[i] > max)
                max = arrMax[i];
        }

        // case ini berbeda dengan rule 1
        // jadi jika ditotal O(M) + O(N) = O(M + N )

        return new Pair<>(min, max);
    }

    public static class Pair<x, y> {

        Pair(Integer min, Integer max) {
            System.out.println("max: " + max);
            System.out.println("min: " + min);
        }
    }
}

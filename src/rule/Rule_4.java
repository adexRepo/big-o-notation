package rule;

public class Rule_4 {
    
    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 3, 4, 5, 6 };
        int[] arr2 = { 45, 7, 321, 412, 21, 22 };

        int[] arrResult = findDuplicate(arr1,arr2);
        for (int i : arrResult) {
            System.out.println("i: " + i);
        }
    }


    public static int[] findDuplicate(int[] arrM, int[] arrN){
        int resultM = -1;
        int resultN = -1;

        for (int i : arrM) { // O(M)
    
            for (int j : arrN) { // O(N)
                if(i == j){
                    resultM = i;
                    resultN = j;

                    break;
                }
            }

            if(resultM != -1){
                break;
            }
        }

        // karena ini asalnya dari dua param yang berbeda
        // maka O(M*N) / O(MN)

        return new int[]{resultM,resultN};
    }

}

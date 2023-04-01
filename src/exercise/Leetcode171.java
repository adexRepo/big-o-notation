package exercise;

public class Leetcode171 {

    /* 
     * Diberikan judul kolom string yang mewakili judul kolom seperti muncul di dalam excel
     * kembalikan nomor kolom yang sesuai
     * contoh :
     * A -> 1
     * B -> 2
     * ...
     * Z -> 26
     * AA -> 27
     * AB -> 28
     * 
     */

    public static void main(String[] args) {

        var integ  = titleToNumber("AB");
        System.out.println("integ: " + integ);
    }

    public static int titleToNumber(String strTitle) {
        int result = 0;

        for (int i = 0; i < strTitle.length(); i++) { // O(N)
            int c = strTitle.charAt(i); // O(N)
            System.out.println("c: " + c);
            int number = (c - 65) + 1;
            result = (result * 26) + number;
        }

        // result  = O(N)
        return result;
    }

}

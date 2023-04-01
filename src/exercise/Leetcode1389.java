package exercise;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1389 {

    /*
     * Diberikan dua array integer dan indeks dengan panjang yang sama.
     * Tugas anda adalah membuat target array dengan aturan berikut.
     * - inisial target array kosong.
     * - dari kiri ke kanan baca angka[i] dan index [i], masukkan pada index[i]
     * nilai angka[i] dalam larik target
     * - ulangi langkah sebelumnya hingga tidak ada elemen yang dibaca nums dan
     * index.
     */

    public static void main(String[] args) {

        int[] nums = { 4, 5, 213, 351, 5342 };
        int[] index = { 0, 1, 2, 3, 4 };

        int[] results = createTargetArray(nums, index);

        for (int j = 0; j < results.length; j++) {

            System.out.println("j: " + j + " -> " + results[j]);
        }
    }

    public static int[] createTargetArray(int[] nums, int[] indexes) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < indexes.length; i++) { // O(N)
            list.add(indexes[i], nums[i]);
        }

        int[] target = new int[indexes.length];
        for (int i = 0; i < list.size(); i++) { // O(N)
            target[i] = list.get(i);
        }

        // result = O(N) + O(N) = O(2N) .. rule 1 => O(N)

        return target;
    }

}

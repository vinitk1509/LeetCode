import java.util.Arrays;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[j] == arr2[i]) {
                    result[index++] = arr1[j];
                    arr1[j] = -1;
                }
            }
        }

        Arrays.sort(arr1);

        for (int i = 0; i < n; i++) {
            if (arr1[i] != -1) {
                result[index++] = arr1[i];
            }
        }

        return result;
    }
}

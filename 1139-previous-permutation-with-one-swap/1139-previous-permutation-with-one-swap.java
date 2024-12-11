public class Solution {
    public int[] prevPermOpt1(int[] A) {
        int N = A.length;
        int s1 = -1;
        for (int i = N-2; i >= 0; i--){
            if (A[i] > A[i+1]){
                s1 = i;
                break;
            }
        }
        if (s1 == -1) return A;
        int s2 = s1 + 1;
        for (int j = s1 + 2; j < N; j++){
            if (A[j] < A[s1] && A[j] > A[s2]){
                s2 = j;
            }
        }
        int t = A[s1];
        A[s1] = A[s2];
        A[s2] = t;

        return A;
    }
}
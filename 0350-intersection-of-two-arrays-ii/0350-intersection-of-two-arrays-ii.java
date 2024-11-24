// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         int n = nums1.length;
//         int m = nums2.length;
//         List<Integer> num1 = Arrays.asList(nums1);
//         for(int i = 0; i < nums2.length; i++){
//             if (!Arrays.asList(nums1).contains(i)) {
//             num1.add(i);
//         }
//         }
//         Integer[] sol = new Integer[num1.size()];
//         sol = list.toArray(sol);

//         return sol;
//     }
// }
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> num1 = new ArrayList<>();  
        for (int num : nums1) {
            num1.add(num);
        }

        List<Integer> result = new ArrayList<>();

        for (int num : nums2) {
            if (num1.contains(num)) {
                result.add(num);
                num1.remove(Integer.valueOf(num)); 
            }
        }

        int[] sol = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            sol[i] = result.get(i);
        }

        return sol;
    }
}

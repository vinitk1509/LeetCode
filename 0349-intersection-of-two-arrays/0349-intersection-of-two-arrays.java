class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                if (index == 0 || temp[index - 1] != nums1[i]) {
                    temp[index++] = nums1[i];
                }
                i++;
                j++;
            }
        }
        return Arrays.copyOf(temp, index);
    
    }
}
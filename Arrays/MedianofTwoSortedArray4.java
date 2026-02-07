class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            res[k++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            res[k++] = nums2[i];
        }
        Arrays.sort(res);
        int n = res.length;
        if (n % 2 == 0) {
            return (res[n /2 - 1] + res[n / 2]) /2.0;
        }else {
            return res[n /2];
        }
    }
}

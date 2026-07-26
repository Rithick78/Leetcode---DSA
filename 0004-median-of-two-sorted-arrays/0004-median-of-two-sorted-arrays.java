class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] mergeArr = new int[m + n];

        int i = 0, j = 0, cnt = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergeArr[cnt] = nums1[i];
                i++;
            } else {
                mergeArr[cnt] = nums2[j];
                j++;
            }
            cnt++;
        }

        while (i < m) {
            mergeArr[cnt] = nums1[i];
            cnt++;
            i++;
        }

        while (j < n) {
            mergeArr[cnt] = nums2[j];
            cnt++;
            j++;
        }

        int len = mergeArr.length;

        if (len % 2 == 1) {
            return mergeArr[len / 2];
        } else {
            return (mergeArr[len / 2 - 1] + mergeArr[len / 2]) / 2.0;
        }
    }
}
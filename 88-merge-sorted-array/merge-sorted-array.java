class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        int[] arr = new int[m + n];
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else if (nums2[j] < nums1[i]) {
                arr[k++] = nums2[j++];
            } else {
                arr[k++] = nums1[i++];
                arr[k++] = nums2[j++];

            }

        }

        while (i < m) {
            arr[k++] = nums1[i++];
        }
        while (j < n) {
            arr[k++] = nums2[j++];
        }
        // copying all values to nums1
        for (int idx = 0; idx < m + n; idx++) {
            nums1[idx] = arr[idx];
        }
    }
}
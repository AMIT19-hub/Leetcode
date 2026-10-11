class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num : nums1) {
            if (map.containsKey(num)) {
                Integer freq = map.get(num);
                map.replace(num, freq + 1);
            } else {
                map.put(num, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (Integer num : nums2) {
            if (map.containsKey(num) && (map.get(num) > 0)) {
                Integer freq = map.get(num);
                list.add(num);
                map.replace(num, freq - 1);
            }
        }
        int j = 0;
        int[] arr = new int[list.size()];
        for (int val : list) {
            arr[j++] = val;

        }
        return arr;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int freq = map.getOrDefault(num, 0) + 1;
            if (freq > nums.length / 2) {
                return num;
            }
            map.put(num, freq);
        }

        return -1; // Majority element is guaranteed to exist.
    }
}
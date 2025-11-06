class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < n; i++) {
            hm.put(nums[i], i);
        }

        for(int i = 0; i < n; i++) {
            int diff = target - nums[i];

            if(hm.containsKey(diff) && hm.get(diff) != i) {
                ans[0] = i;
                ans[1] = hm.get(diff);
                break;
            }
        }

        return ans;
    }
}

// time complexity -> O(n)
// space complexity -> O(n)

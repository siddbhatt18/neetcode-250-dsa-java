### Iteration - Two Pass
```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int result[] = new int[2 * n];
        int idx = 0;
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < n; j++) {
                result[idx] = nums[j];
                idx++;
            }
        }
        return result;
        // time complexity: O(n)
        // space complexity: O(n)
    }
}
```

### Iteration - One Pass
```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2 * n];
        for(int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
        // time complexity: O(n)
        // space complexity: O(n)
    }
}
```

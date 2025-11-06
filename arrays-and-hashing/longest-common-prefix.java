class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) {
            return strs[0];
        }
        
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            String word = strs[i];
            int idx = 0;
            int min = Math.min(prefix.length(), word.length());

            while(idx < min) {
                if(prefix.charAt(idx) != word.charAt(idx)) {
                    break;
                }
                idx++;
            }

            prefix = prefix.substring(0, idx);
        }
        
        return prefix;
    }
}

// time complexity -> O(n * m)
// space complexity -> O(1)

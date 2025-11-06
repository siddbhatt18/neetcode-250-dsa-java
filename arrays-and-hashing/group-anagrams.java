class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String word = strs[i];
            int count[] = new int[26];

            for(int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                count[ch - 'a']++;
            }

            String key = Arrays.toString(count);

            if(!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(word);
        }

        return new ArrayList<>(hm.values());
    }
}

// time complexity -> O(m * n)
// space complexity -> O(m * n)

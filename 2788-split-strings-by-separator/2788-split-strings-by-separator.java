class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for(String word : words) {
            int left = 0;
            while(left < word.length()) {
                int right = left;
                while(right < word.length() && word.charAt(right) != separator) {
                    right++;
                }
                if(right - left > 0) {
                    res.add(word.substring(left, right));
                }
                left = right + 1;
            }

        }
        return res;
    }
}
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for (String word:words) {
            int s = 0;
            for (int i=0;i<word.length();i++) {
                s += weights[word.charAt(i) - 'a'];
            }
            char Char1 = (char) ('z'-(s % 26));
            sb.append(Char1);
        }
        return sb.toString();
    }
}
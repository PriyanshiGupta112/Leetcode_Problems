class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set=new HashSet<>();
        int pairs=0;
        for(String word:words){
            String rev=new StringBuilder(word).reverse().toString();
            if(set.contains(rev)){
                pairs++;
            }
            else{
                set.add(word);
            }
        }
        return pairs;
    }
}
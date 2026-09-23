class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] c1=new int[26];
        for(char c: magazine.toCharArray()){
            c1[c-'a']++;
        }
        for(char c: ransomNote.toCharArray()){
            if(c1[c-'a']==0){
                return false;
            }
            c1[c-'a']--;
        }
        return true;
        
    }
}
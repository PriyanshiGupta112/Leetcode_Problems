class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }

        boolean[] seen = new boolean[26];
        int count=0;

        for(int i=0;i<sentence.length();i++){
            int ind=sentence.charAt(i)-'a';
            if(!seen[ind]){
                seen[ind]=true;
                count++;
                if(count==26){
                    return true;
                }
            }
        }
        return count==26;
    }
}
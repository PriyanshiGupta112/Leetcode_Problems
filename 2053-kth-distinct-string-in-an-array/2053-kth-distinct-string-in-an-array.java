class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int c=0;
        for(String s:arr){
            if(map.get(s)==1){
                c++;
                if(c==k) return s;
            }
        }
        return "";
    }
}
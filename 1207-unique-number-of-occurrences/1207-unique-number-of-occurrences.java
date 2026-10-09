import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> freqmap=new HashMap<>();
        for(int nums: arr){
            freqmap.put(nums,freqmap.getOrDefault(nums,0)+1);
        }
        Set<Integer> set=new HashSet<>(freqmap.values());
        return set.size() == freqmap.size();
    }
}
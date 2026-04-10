class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean dup=false;
        Set<Integer> x = new HashSet<Integer>();
        for(int i : nums){
            if (x.contains(i)){
                dup=true;
                break;
        }
        else{
            x.add(i);
        }
        }
        return dup;
        
    
}
}
  
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first[] = new int[2];
        if (target % 2 == 0){
            int val = target / 2;
            int count=0;
            for (int i=0; i < nums.length; i++){
                if (nums[i] == val){
                    first[count] = i;
                    count++;
                }
                if (count > 1){
                    return first;
                }
            }
        }
        HashMap<Integer,Integer> numbers = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            numbers.put(i,nums[i]);
        }
        int step=0;
        for (int i = 0; i < nums.length; i++){
            int rem = target - nums[i];
            if (numbers.containsValue(rem) && ((int)numbers.get(i) != rem)){
                System.out.println(rem);
                first[step] = i;
                step++;
            }
        }
        return first;
    }
}
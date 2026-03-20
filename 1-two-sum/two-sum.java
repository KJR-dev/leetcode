class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int findNum=target-nums[i];
            if(map.containsKey(findNum)){
                return new int[]{i,map.get(findNum)};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
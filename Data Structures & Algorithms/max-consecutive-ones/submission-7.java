class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        //Current counter
        int count = 0;

        //Maximum Consecutive Count
        int maxConsecutiveCount = 0;

        //We iterate to have every element of the array
        for(int i = 0; i < nums.length; i++){

            //If the index is equal to 1 we increment the count
            if(nums[i] == 1) count++;

            //If it's anything other than 1, we reset the count
            else { count = 0; }
                
            //We want the maximum consecutive count
            maxConsecutiveCount = Math.max(count, maxConsecutiveCount);
        }

        //If there's no consecutive we return nothing (0)
        return maxConsecutiveCount;
    }
}
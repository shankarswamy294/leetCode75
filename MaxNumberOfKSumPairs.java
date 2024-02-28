public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        int i=0;
        int j=nums.length-1;
        int count=0;
        Arrays.sort(nums);
        while(i<j){
            if(nums[i]+nums[j]==k){
                count+=1;
                i+=1;
                j-=1;
            }else{
                if(nums[i]+nums[j]<k){
                    i+=1;
                }else{
                    j-=1;
                }
            }
        }
        return count;
    }
}

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        Integer i,j=null;
        i = nums[0];
        for(int l=1; l<nums.length; l++){
            if(nums[l]<i){
                i=nums[l];
            }else if(nums[l]>i){
                if(j==null){
                    j=nums[l];
                }else{
                    if(nums[l]<j){
                        j=nums[l];
                    }else if(nums[l]>j){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

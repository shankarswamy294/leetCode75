public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        Integer product = null;
        int zeroCount = 0;
        for(int i: nums){
            if(i == 0){
                zeroCount+=1;
            }else{
                product = product==null ? 1*i : product*i;
            }
        }
        int i=0;
        while(i<nums.length){
            if(zeroCount>1)
                nums[i]=0;
            else if(zeroCount==1)
                nums[i] = nums[i]!=0 ? 0 : (product == null ? 0 : product);
            else
                nums[i] = product/nums[i];
            i+=1;
        }
        return nums;
    }
}

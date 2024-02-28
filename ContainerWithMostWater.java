public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int result = 0;
        while(i<j){
            result = Math.max(Math.min(height[i],height[j])*(j-i), result);
            if(height[i]<height[j]){
                i+=1;
            }else{
                j-=1;
            }
        }
        return result;
    }
}

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0;
        int len = flowerbed.length;
        if (len==1){
            if(flowerbed[0] == 0)
                n-=1;
            return n<=0 ? true : false;
        }
        if(i==0 && len>2 && flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            n-=1;
        }
        i+=1;
        while(i<len){
            if(i+1 < len){
                if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    n-=1;
                }
            }else{
                if(flowerbed[i]==0 && flowerbed[i-1]==0){
                    flowerbed[i]=1;
                    n-=1;
                }
            }
            i+=1;
        }
        return n <= 0 ? true : false;
    }
}

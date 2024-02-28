public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        char[] charArr = s.toCharArray();
        int maxvovelCount=0;
        int vovelCount=0;

        int j=k-1;
        while(j>-1){
            if(charArr[j] == 'a' || charArr[j] == 'e' || charArr[j] == 'i' || charArr[j] == 'o' || charArr[j] == 'u'){
                vovelCount+=1;
            }
            j-=1;
        }
        maxvovelCount = vovelCount;
        j=k;
        int i=0;
        while(j<charArr.length){
            if(charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u'){
                vovelCount-=1;
            }
            if(charArr[j] == 'a' || charArr[j] == 'e' || charArr[j] == 'i' || charArr[j] == 'o' || charArr[j] == 'u'){
                vovelCount+=1;
            }
            i+=1;
            j+=1;
            maxvovelCount = Math.max(vovelCount, maxvovelCount);
        }
        return maxvovelCount;
    }
}

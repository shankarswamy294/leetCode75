public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        char[] s1 = word1.toCharArray();
        char[] s2 = word2.toCharArray();

        int min_ = Math.min(s1.length, s2.length);
        String s = "";

        int i=0;
        while(min_>0){
            s = s + s1[i]+s2[i];
            i+=1;
            min_ -= 1;
        }
        while(i<s1.length){
            s=s+s1[i];
            i+=1;
        }
        while(i<s2.length){
            s+=s2[i];
            i+=1;
        }
        return s;
    }
}

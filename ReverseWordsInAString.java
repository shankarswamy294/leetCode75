public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] splitStr = s.split(" ");
        String result = "";
        for(String st: splitStr){
            if (!st.equals(""))
                result = !result.equals("") ?  st + " " + result : st;
        }
        return result;
    }
}

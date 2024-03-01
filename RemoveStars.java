public class RemoveStars {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(Character i: s.toCharArray()){
            if(i == '*'){
                if(!st.empty()){
                    st.pop();
                }
            }else{
                st.push(i);
            }
        }
        String result = "";
        while(!st.empty()){
            result = st.pop()+result;
        }
        return result;
    }
}

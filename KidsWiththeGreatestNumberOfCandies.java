public class KidsWiththeGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max_ = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList();
        for(int each: candies){
            result.add(each+extraCandies>=max_ ? true: false);
        }
        return result;
    }
}

public class FindtheDifferenceofTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hash1 = new HashMap<>();
        Map<Integer, Integer> hash2 = new HashMap<>();
        for(int nu: nums1){
            hash1.put(nu, 1);
        }
        for(int nu: nums2){
            if(hash1.containsKey(nu)){
                hash1.put(nu, hash1.get(nu)+1);
            }else{
                hash2.put(nu, 1);
            }
        }

        List<List<Integer>> result = new ArrayList();
        List<Integer> l1 = new ArrayList();
        List<Integer> l2 = new ArrayList();
        for(Integer i: hash1.keySet()){
            int val = hash1.get(i);
            if(val==1)
                l1.add(i);
        }
        for(Integer i: hash2.keySet()){
            int val = hash2.get(i);
            if(val==1)
                l2.add(i);
        }
        result.add(l1);
        result.add(l2);

        return result;
    }
}

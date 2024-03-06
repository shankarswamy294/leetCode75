public class KeysAndRooms {
    public void dfs(int presentIndex, List<List<Integer>> rooms, List<Integer> visitedRooms){
        for(int i: rooms.get(presentIndex)){
            if(visitedRooms.get(i)==0){
                visitedRooms.set(i,1);
                dfs(i, rooms, visitedRooms);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<Integer> visitedRooms = new ArrayList<>();
        int i=0;
        while(i<rooms.size()){
            visitedRooms.add(0);
            i+=1;
        }
        visitedRooms.set(0,1);
        dfs(0, rooms, visitedRooms);
        for(int j: visitedRooms){
            if(j==0)
                return false;
        }
        return true;
    }
}
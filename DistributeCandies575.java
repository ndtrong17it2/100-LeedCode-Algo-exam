class DistributeCandies575 {
    public int distributeCandies(int[] candies) {
        Set<Integer> maps = new HashSet<Integer>();
        for(int candie: candies){
            maps.add(new Integer(candie));
        }
        if(maps.size() > candies.length / 2) return candies.length / 2;
        return maps.size();
    }
}
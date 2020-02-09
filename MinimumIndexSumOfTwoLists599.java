class MinimumIndexSumOfTwoLists599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minSum = Integer.MAX_VALUE;
        int indexMinSum = 0;
        List<String> result = new ArrayList<String>();
        for(int i = 0; i < list1.length; i++){
            for(int j = 0; j < list2.length; j++){
                if(list1[i].equals(list2[j]) && (i + j) < minSum){
                    minSum = i + j;
                    indexMinSum = i;
                    result.add(list1[i]);
                    break;
                }
                if(list1[i].equals(list2[j]) && i + j == minSum){
                    result.add(list1[i]);
                    break;
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
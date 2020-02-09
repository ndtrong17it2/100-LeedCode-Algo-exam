class AssignCookies455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        // List<Integer> 
        int satisfyChild = 0;
        
        for(int j = 0; j < s.length; j++){
            for(int i = satisfyChild; i < g.length; i++){
                if(s[j] >= g[i]){
                    satisfyChild++;
                    break;
                }
            }
        }
        return satisfyChild;
    }
}
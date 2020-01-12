class BackspaceStringCompare844 {
    public boolean backspaceCompare(String S, String T) {
        S = S.toLowerCase();
        T = T.toLowerCase();
        while(S.contains("#") || T.contains("#")){
            S = S.replaceFirst(".[#]", "");
            T = T.replaceFirst(".[#]", "");
            S = S.startsWith("#") ? S.substring(1) : S;
            T = T.startsWith("#") ? T.substring(1) : T;
        }
        return S.equals(T);
    }
}
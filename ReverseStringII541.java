class ReverseStringII541 {
    public String reverseStr(String s, int k) {
        if(s.length() < k) return (new StringBuilder(s)).reverse().toString();
        if(s.length() <= 2*k) return (new StringBuilder(s.substring(0, k))).reverse().toString() + s.substring(k);
        char[] chars = s.toCharArray();
        
        for(int i = 0; i < chars.length; i += 2 * k){
            if(i + k - 1 > chars.length){
                reverse(chars, i, chars.length - 1);
            }else{
                reverse(chars, i, i + k - 1);
            }
            
        }
        return new String(chars);
    }
    public void reverse(char[] arrays, int begin, int end){
        int mid = (begin + end) / 2;
        for(; begin <= mid; begin++, end--){
            char temp = arrays[begin];
            arrays[begin] = arrays[end];
            arrays[end] = temp;
        }
    }
}
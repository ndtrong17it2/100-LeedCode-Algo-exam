class AddStrings415 {
    public String addStrings(String num1, String num2) {
        char[] nums1 = num1.toCharArray();
        char[] nums2 = num2.toCharArray();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        String result = "";
        int mod, div = 0;
        while(true){
            int element;
            if(i < 0 && j < 0){
                result += div != 0 ? div : "";
                break;
            }else if(i < 0){
                element = div + (nums2[j] - 48);
            }else if(j < 0){
                element = div + (nums1[i] - 48);
            }else{
                element = div + (nums1[i] - 48) + (nums2[j] - 48);
            }
            mod = element % 10;
            div = element / 10;
            result += mod;
            i--;
            j--;
        }
        
        return (new StringBuilder(result)).reverse().toString();
    }
}
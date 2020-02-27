class LicenseKeyFormatting482 {
    public String licenseKeyFormatting(String S, int K) {
        char[] chars = S.toCharArray();
        int index = chars.length - 1;
        String s = "";
        int kCount = K;
        while(index >= 0){
            if(kCount == 0) {
                kCount = K;
                s += "-";
                continue;
            }
            if(chars[index] == '-') {
                index--;
                continue;
            }
            s += String.valueOf(chars[index]);
            index--;
            kCount--;
        }
        if(s.length() > 0 && s.charAt(s.length() - 1) == '-') s = s.substring(0, s.length() - 1);
        return (new StringBuilder(s)).reverse().toString().toUpperCase();
    }
}
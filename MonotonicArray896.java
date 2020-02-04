class MonotonicArray896 {
    public boolean isMonotonic(int[] A) {
        if(A.length < 2) return true;
        int beginIndex = 0;
        for(int i = 0; i < A.length - 1; i++){
            if(A[i] < A[i + 1] || A[i] > A[i + 1]){
                beginIndex = i;
                break;
            }
        }
        if(A[beginIndex] > A[beginIndex + 1]){
            for(int i = beginIndex; i < A.length - 1; i++){
                if(A[i] < A[i + 1]){
                    return false;  
                }
            }    
        }
        if(A[beginIndex] < A[beginIndex + 1]){
            for(int i = beginIndex; i < A.length - 1; i++){
                if(A[i] > A[i + 1]){
                    return false;  
                }
            }    
        }
        return true;
        
    }
}
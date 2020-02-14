class StudentAttendanceRecordI551 {
    public boolean checkRecord(String s) {
        byte countLate = 0;
        byte countAbsent = 0;
        for(char attendance: s.toCharArray()){
            if(attendance == 'L') {
                countLate++;
            }
            else if(attendance == 'A') {
                countAbsent++;
                countLate = 0;
            }else{
                countLate = 0;
            }
            if(countLate > 2 || countAbsent > 1){
                return false;
            }
        }
        return true;
    }
}
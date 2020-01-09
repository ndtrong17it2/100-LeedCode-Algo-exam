public class HammingDistance461 {

	public int hammingDistance(int x, int y) {
        String[] splitX = String.format("%032d", Integer.parseInt(Integer.toBinaryString(x))).split("");
        String[] splitY = String.format("%032d", Integer.parseInt(Integer.toBinaryString(y))).split("");
        int i = 0, count = 0;
        while(i < splitX.length){
            if(!splitX[i].equals(splitY[i])) {
                count++;
            }
            i++;
        }
        return count;
    }
}

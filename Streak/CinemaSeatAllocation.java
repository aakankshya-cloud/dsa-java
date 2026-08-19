import java.util.HashMap;

public class CinemaSeatAllocation {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, boolean[]> map = new HashMap<>();
        for(int[] seat : reservedSeats){
            int row = seat[0];
            int col = seat[1];
            if(col >= 2 && col <= 9){
                map.putIfAbsent(row, new boolean[11]);
                map.get(row)[col] = true;
            }
        }
        int count = (n - map.size()) * 2;
        for(boolean[] seats : map.values()){
            boolean left = !seats[2] && !seats[3] && !seats[4] && !seats[5];

            boolean right = !seats[6] && !seats[7]
                    && !seats[8] && !seats[9];

            boolean middle = !seats[4] && !seats[5]
                    && !seats[6] && !seats[7];
            if(left && right){
                count = count + 2;
            }
            if(left || right || middle){
                count = count + 1;
            }
        }
        return count;
    }
}

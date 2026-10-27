

public class ArrNeighbourSum {
    public int sum(int[] arr){
        int sum = 0;
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1] && arr[i] > arr[i - 1]){
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}

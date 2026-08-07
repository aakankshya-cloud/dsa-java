public class SumOfSubarrayMin  {
    public int Sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = i ; j < arr.length; j++){
                min = Math.min(arr[j], min);
                sum = (sum + min) ;
            }
        }
        return sum;
    }


    public int Sum(int[] arr){
        int total = 0;
        int[] next = findNextSmaller(arr);
        int[] prev = findPrevSmaller(arr);
        for(int i = 0; i < arr.length - 1; i++){
            int left = i - prev[i];
            int right = next[i] - i;
            total += (right * left * arr[i]);
        }
        return total;
    }
}

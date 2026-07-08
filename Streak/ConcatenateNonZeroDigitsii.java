public class ConcatenateNonZeroDigitsii {
    public int[] sumAndMultiply(String s, int[][] queries){
        int MOD = 1000000007;
        int[] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            long sum = 0;
            int x = 0;
            for(int j = start; j <= end; j++){
                if(s.charAt(j) != '0'){
                    x =  (x*10 + ((s.charAt(j) - '0'))) % MOD;
                    sum = sum + (s.charAt(j) - '0');
                }
            }
            answer[i] = (int) ((x * sum) % MOD);
        }
        return answer;
    }
}

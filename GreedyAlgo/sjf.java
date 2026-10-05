package GreedyAlgo;

import java.util.Arrays;

public class sjf {
    public int leastWaitingTime(int[] time){
        Arrays.sort(time);
        int[] prefix = new int[time.length];
        prefix[0] = 0;
        for(int i = 1; i < time.length; i++){
            prefix[i] = prefix[i - 1] + time[i - 1];
        }
        int sum = 0;
        for(int i = 0; i < prefix.length; i++){
            sum += prefix[i];
        }
        return sum / prefix.length;
    }
}

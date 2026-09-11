package GreedyAlgo;

import java.util.HashMap;

public class assignCookies {
    public int findContentChildren(int[] g, int[] s){
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length; i++){
            map.put(s[i], map.getOrDefault(s[i], 0) + 1);
        }
        for(int i = 0; i < g.length; i++){
            for(int key : map.keySet()){
                if(key >= g[i]){
                    cnt++;
                    map.put(key, map.get(key) - 1);
                }
            }
        }
        return cnt;
    }
}

package GreedyAlgo;

public class lemonadechange {
    public boolean lemonadeChange(int[] bills){
        int fiveRupees = 0;
        int tenRupees = 0;
        int twentyRupees = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                fiveRupees++;
            }
            else if(bills[i] == 10){
                tenRupees++;
                fiveRupees--;
                if(fiveRupees < 0){
                    return false;
                }
            }
            else{
                twentyRupees++;
                if(tenRupees > 0){
                    tenRupees--;
                    fiveRupees--;
                }
                else if(fiveRupees >= 3){
                    for(int j = 0; j < 3; j++){
                        fiveRupees--;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}

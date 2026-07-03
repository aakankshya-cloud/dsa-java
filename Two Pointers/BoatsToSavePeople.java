import java.util.Arrays;

public class BoatsToSavePeople {
    public static int numRescueBoats(int[] people, int limit){
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        int count = 0;
        while(i <= j) {
            if(people[i] + people[j] <= limit){
                i++;
            }
            j--;
            count++;

        }
        return count;
    }
    public static void main(String[] args) {
        int[] people = {1,2};
        int limit = 3;
        System.out.println(numRescueBoats(people,limit));
    }
}

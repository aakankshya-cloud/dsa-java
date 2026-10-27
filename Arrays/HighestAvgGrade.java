import java.util.HashMap;

public class HighestAvgGrade {
    public String highestGrade(String[] grades){
        HashMap<String, Integer> totals = new HashMap<>();
        HashMap<String, Integer> counts = new HashMap<>();
        for(String s : grades){
            String[] parts = s.split(":");
            String name = parts[0].trim();
            int grade = Integer.parseInt(parts[1].trim());
            totals.put(name, totals.getOrDefault(name, 0) + grade);
            counts.put(name, counts.getOrDefault(name, 0) + 1);
        }
        double highestGrade = Double.NEGATIVE_INFINITY;
        String topper = "";
        for(String name : totals.keySet()){
            double avg = (double) totals.get(name) / counts.get(name);
            if(avg > highestGrade){
                highestGrade = avg;
                topper = name;
            }
        }
        return topper;
    }
}

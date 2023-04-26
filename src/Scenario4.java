import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

// Scenario to view the top economical bowler for the year 2015
public class Scenario4 {

    public static void print() {
        int n1 = ReadCSV.matchesrecord.size();

        Map<String, Integer> map = new TreeMap<>(); // Map to add all Match Id played in 2015
        int year = 2015;
        for (int i = 1; i < n1; i++) {
            String mid = ReadCSV.matchesrecord.get(i).id;
            int y = Integer.parseInt(ReadCSV.matchesrecord.get(i).season);
            if (y == year) {
                if (!map.containsKey(mid)) map.put(mid, 0); // to store all the match id of year 2015
            }

        }

        int n2 = ReadCSV.deliveriesrecord.size();
        TreeMap<String, ArrayList<Integer>> map1 = new TreeMap<String, ArrayList<Integer>>(); // Map to store bowler name as a key & No of balls & runs as value in array list

        for(int i=1;i<n2;i++)
        {
            String matchid = ReadCSV.deliveriesrecord.get(i).match_id; // match id of current object
            String bler = ReadCSV.deliveriesrecord.get(i).bowler;       // bowler name of current object
            int balls = Integer.parseInt(ReadCSV.deliveriesrecord.get(i).ball); // Ith ball of current over
            int runs = Integer.parseInt(ReadCSV.deliveriesrecord.get(i).total_runs); // no of runs in current ball
            if(map.containsKey(matchid)) {
                if (!map1.containsKey(bler)) {      // if bowler not present in map then add key and then add 1st ball and no of runs in that ball

                    map1.put(bler, new ArrayList<Integer>());
                    map1.get(bler).add(1);
                    map1.get(bler).add(runs);
                } else {                            // If bowler present then increase ball by 1 and runs by runs in that ball
                    map1.get(bler).set(0,map1.get(bler).get(0)+1);  // Balls at 0 index and runs at 1 index
                    map1.get(bler).set(1,map1.get(bler).get(1)+runs);
                }
            }
        }

        Map<Double, String> map2 = new TreeMap<>(); // Map to store economy rate and name of bowler

        double min = Double.MAX_VALUE;
        for(String s: map1.keySet())
        {
            double avg = (map1.get(s).get(1)) / ((map1.get(s).get(0))/6.0);
            if(avg<min) min = avg;
        map2.put(avg,s);
        }
        
        System.out.println("Top Economical Bowler for the year 2015 is : "+map2.get(min));
    }
}

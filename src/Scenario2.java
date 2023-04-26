import java.util.Map;
import java.util.TreeMap;

public class Scenario2 {

   public static void print()
    {
        Map<String,Integer> map = new TreeMap<>();
        int n = ReadCSV.matchesrecord.size();
        for(int i = 1;i < n;i++)
        {
            String team1 = ReadCSV.matchesrecord.get(i).team1;
            String team2 = ReadCSV.matchesrecord.get(i).team2;
            String winner = ReadCSV.matchesrecord.get(i).winner;
            if(!map.containsKey(team1)) map.put(team1,0);
                if(!map.containsKey(team2)) map.put(team2,0);
              if(!winner.isEmpty()) map.put(winner, map.get(winner)+1);


        }
        System.out.println(map);
    }

}

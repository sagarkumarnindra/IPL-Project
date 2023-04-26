import java.util.Map;
import java.util.TreeMap;

// Scenario to view number of matches won of all teams over all the years of IPL.
public class Scenario2 {

   public static void print()
    {
        Map<String,Integer> map = new TreeMap<>();
        int n = ReadCSV.matchesrecord.size();
        for(int i = 1;i < n;i++)
        {
            String team1 = ReadCSV.matchesrecord.get(i).team1; // team one name per object
            String team2 = ReadCSV.matchesrecord.get(i).team2; // team two name per object
            String winner = ReadCSV.matchesrecord.get(i).winner; // winner team name per object
            if(!map.containsKey(team1)) map.put(team1,0);       // add team if not available
                if(!map.containsKey(team2)) map.put(team2,0);   // add team if not available
              if(!winner.isEmpty()) map.put(winner, map.get(winner)+1); // increase teams key value if they won


        }

        System.out.println("Number of matches won by teams over all year in IPL :");

        for(String s : map.keySet())        // for each loop to print key and values one by one
            System.out.println(s+" = "+map.get(s));
    }

}

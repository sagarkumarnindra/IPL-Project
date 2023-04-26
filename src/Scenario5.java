import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

// Scenario to view all the players who won man of the match and number of times they won award in IPL.
public class Scenario5 {

    public static void print()
    {
        Map<String,Integer> map = new TreeMap<>();
        int n = ReadCSV.matchesrecord.size();

        for(int i = 1;i < n;i++)
        {
            String player = ReadCSV.matchesrecord.get(i).player_of_match;
            if(!player.isEmpty()) {
                if (!map.containsKey(player)) map.put(player, 1);   // add winner if not available
                else map.put(player, map.get(player) + 1);
            }
        }

        System.out.println("Players who won man of the match and number of times they won award in IPL. :");

        for(String s : map.keySet())        // for each loop to print key and values one by one
            System.out.println(s+" = "+map.get(s));

    }

}

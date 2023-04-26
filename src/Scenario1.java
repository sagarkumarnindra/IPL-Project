import com.sun.source.tree.Tree;

// Scenario to display number of matches played per year

import java.util.*;
public class Scenario1 {

    public static void print()
    {
        Map<String,Integer> map = new TreeMap<>(); //Map to store pairs of year and count of matches

        int n = ReadCSV.matchesrecord.size();
        for(int i = 1;i < n;i++)  // Loops run in matches data
        {
            String year = (ReadCSV.matchesrecord.get(i).season);
            if(map.containsKey(year))           // increase year value if present in map
                map.put(year,map.get(year)+1);
            else                                  // add key to map if not present
                map.put(year,1);
        }
        System.out.println("Count of Matches each Year : ");

        for(String s : map.keySet())        // for each loop to print key and values one by one
            System.out.println(s+" = "+map.get(s));

    }
}

import com.sun.source.tree.Tree;

import java.util.*;
public class Scenario1 {

    public static void print()
    {
        Map<Integer,Integer> map = new TreeMap<>();
        ReadCSV obj = new ReadCSV();
        int n = obj.matchesrecord.size();
        for(int i = 1;i < n;i++)
        {
            int year = Integer.parseInt(obj.matchesrecord.get(i).season);
            if(map.containsKey(year))
                map.put(year,map.get(year)+1);
            else
                map.put(year,1);
        }
        System.out.println(map);



    }

}
import java.util.*;

public class Scenario3 {

public static void print()
{
    int n1 = ReadCSV.matchesrecord.size();
    ArrayList<String> id = new ArrayList<String>();
    Map<String,Integer> map = new TreeMap<>();
    int year = 2016;
    for(int i=1;i<n1;i++)
    {
        String mid = ReadCSV.matchesrecord.get(i).id;
        int y = Integer.parseInt(ReadCSV.matchesrecord.get(i).season);
        if(y==year)
        {
            if(!map.containsKey(mid)) map.put(mid,0);
        }
    }
    // System.out.println(map);

    int n2 = ReadCSV.deliveriesrecord.size();
    Map<String,Integer> map1 = new TreeMap<>();

    for(int i=1;i<n2;i++)
    {
        String matchid = ReadCSV.deliveriesrecord.get(i).match_id;
        String bteam = ReadCSV.deliveriesrecord.get(i).batting_team;
        int eruns = Integer.parseInt(ReadCSV.deliveriesrecord.get(i).extra_runs);
        if(map.containsKey(matchid))
        {
        if(!map1.containsKey(bteam)) map1.put(bteam, eruns);
        else map1.put(bteam, map1.get(bteam)+eruns);
        }
    }

    System.out.println(map1);

}

}

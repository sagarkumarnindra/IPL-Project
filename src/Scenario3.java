import java.util.*;

// Scenario to view the extra runs conceded per team for the year 2016


public class Scenario3 {

public static void print()
{

    int n1 = ReadCSV.matchesrecord.size();
    Map<String,Integer> map = new TreeMap<>(); // Map to add all Match Id played in 2016

    int year = 2016;

    for(int i=1;i<n1;i++)
    {
        String mid = ReadCSV.matchesrecord.get(i).id;
        int y = Integer.parseInt(ReadCSV.matchesrecord.get(i).season);
        if(y==year)
        {
            if(!map.containsKey(mid)) map.put(mid,0); //add match id if year is 2016
        }
    }


    int n2 = ReadCSV.deliveriesrecord.size();
    Map<String,Integer> map1 = new TreeMap<>();

    for(int i=1;i<n2;i++)
    {
        String matchid = ReadCSV.deliveriesrecord.get(i).match_id; // store match id of current object
        String bteam = ReadCSV.deliveriesrecord.get(i).batting_team; // store batting team name of current object
        int eruns = Integer.parseInt(ReadCSV.deliveriesrecord.get(i).extra_runs); // store extra runs

        // If match ID matches in delivery table then check for the batting team & increase extra runs of that team

        if(map.containsKey(matchid))
        {
        if(!map1.containsKey(bteam)) map1.put(bteam, eruns);
        else map1.put(bteam, map1.get(bteam)+eruns);
        }
    }

    System.out.println("Extra runs conceded per team for the year 2016 :");

    for(String s : map1.keySet())        // for each loop to print key and values one by one
        System.out.println(s+" = "+map1.get(s));

}

}

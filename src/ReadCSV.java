import java.io.*;
import java.util.*;

class ReadCSV {

    static ArrayList<Deliveries> deliveriesrecord = new ArrayList<Deliveries>(); // Array list of deliveries object

    static ArrayList<Matches> matchesrecord = new ArrayList<Matches>(); // Array list of matches object

    public static void main(String args[]) throws Exception
    {

        ReadCSV obj = new ReadCSV();

        // Read & Store deliveries data

        BufferedReader delivery = new BufferedReader(new FileReader("deliveries.csv"));

        Deliveries d; // deliveries object

        String line = "";

        while((line = delivery.readLine()) != null) //loop to extract deliveries csv files line & split store the fields value in an object.
       {
            String[] fields = line.split(",", -1); // split the extracted string, -1 to store the empty values

            d =  new Deliveries(fields[0],fields[1],fields[2],fields[3],fields[4],fields[5],fields[6],
           fields[7],fields[8],fields[9],fields[10],fields[11],fields[12],fields[13],fields[14],
           fields[15],fields[16],fields[17],fields[18],fields[19],fields[20]); // creating objects and sending values to constructor

            obj.deliveriesrecord.add(d); // adding objects in array list
       }
        delivery.close();

        // Read & Store Matches data

        BufferedReader match = new BufferedReader(new FileReader("matches.csv"));

        Matches m; // matches object

        String line1 = "";

        while((line1 = match.readLine()) != null) //loop to extract matches csv files line & split store the fields value in an object.
        {
            String[] fields1 = line1.split(",", -1); // split the extracted string, -1 to store the empty values

            m =  new Matches(fields1[0],fields1[1],fields1[2],fields1[3],fields1[4],fields1[5],fields1[6],
                    fields1[7],fields1[8],fields1[9],fields1[10],fields1[11],fields1[12],fields1[13],fields1[14],
                    fields1[15],fields1[16],fields1[17]); // creating objects and sending values to constructor

            obj.matchesrecord.add(m); // adding objects in array list
        }
        match.close();



        Scenario1.print();
        Scenario2.print();


    }


}

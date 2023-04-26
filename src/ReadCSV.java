import java.io.*;
import java.util.*;

class ReadCSV {

    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("deliveries.csv"));

        Deliveries d; // deliveries object
        ArrayList<Deliveries> deliveriesrecord = new ArrayList<Deliveries>(); // Array list of deliveries object
        String line = "";

        while((line = br.readLine()) != null) //loop to extract deliveries csv files line & split store the fields value in an object.
       {
            String[] fields = line.split(",", -1); // split the extracted string, -1 to store the empty values

            d =  new Deliveries(fields[0],fields[1],fields[2],fields[3],fields[4],fields[5],fields[6],
           fields[7],fields[8],fields[9],fields[10],fields[11],fields[12],fields[13],fields[14],
           fields[15],fields[16],fields[17],fields[18],fields[19],fields[20]); // creating objects and sending values to constructor

            deliveriesrecord.add(d); // adding objects in array list
       }




    }


}

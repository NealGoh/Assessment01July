package assessment.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static final String delimiter = ","; //How to tell the computer when each line is finish

    public CSVReader(File file) {
    }
    public static void read(String csvFile) {
        try {
           File file = new File(csvFile);
           FileReader fr = new FileReader(file);
           BufferedReader br = new BufferedReader(fr);
           String input = "";
           String[] dataArr; //storing the data 

           input = br.readLine(); //skip first line of the CSV file
           
           while((input = br.readLine()) != null) {
              dataArr = input.split(delimiter);
              for(String tempStr : dataArr) {
                 System.out.print(tempStr + " ");
              }
              System.out.println();
           }
           br.close();
           } catch(IOException ioe) {
              ioe.printStackTrace();
           }
     }
     public static void main(String[] args) {
        // CSV file directory 
        String csvFile = "/Users/Zerouf/vttp2022/task01/src/main/java/assessment/task01/thankyou.csv";
         CSVReader.read(csvFile);
     }
   //CSV Reader ends here
   //How to store CSV values into a hashmap?

}

package assessment.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CSVReader {

    public static final String delimiter = ","; //How to tell the computer when each line is finish

    public CSVReader(File file) {
    }

    public static void main(String[] args) throws Exception {
      // CSV file directory 
      String csvFile = "/Users/Zerouf/vttp2022/task01/src/main/java/assessment/task01/thankyou.csv";
      CSVReader.read(csvFile);
   }

    public static void read(String csvFile) {
        try {
           File file = new File(csvFile);
           FileReader fr = new FileReader(file);
           BufferedReader br = new BufferedReader(fr);
           String input = "";
           String[] dataArr; 
           
           while((input = br.readLine()) != null) {
              dataArr = input.split(delimiter);
              for(String tempStr : dataArr) {
                 System.out.print(tempStr + " ");
              }
              System.out.println();
              
              List<String> header = new ArrayList<>();
              header.add(br.readLine());
              List<String> body = new ArrayList<>();
              body.add(br.readLine());
              
              Map<String, String> recepients = new HashMap<String, String>();
              recepients.put(header, body);
           }
           br.close();
           } catch (FileNotFoundException e) {
              e.printStackTrace(); 
           } catch(IOException e) {
              e.printStackTrace();
           }
           
     }
   //CSV Reader ends here



} 

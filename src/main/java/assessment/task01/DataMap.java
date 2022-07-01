package assessment.task01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class DataMap 
{
    public static void main( String[] args ) throws Exception {

        String csvFile = "/Users/Zerouf/vttp2022/task01/src/main/java/assessment/task01/thankyou.csv";
        try{
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            CSVParser records = CSVParser.parse(br,CSVFormat.DEFAULT);
            Map<Integer, Data> dataMap = new HashMap<Integer, Data>();
            for(CSVRecord record:records) {
                Data data = new Data();
                data.setName(record.get(0));
                data.setAddress(record.get(2));
                data.setYears(Integer.parseInt(record.get(3)));
 
                dataMap.put(Integer.parseInt(record.get(0)), data);
            } 
 
            System.out.println(dataMap);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

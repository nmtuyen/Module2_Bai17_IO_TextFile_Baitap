package readFile;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<String> parseCsvLine(String line){
        List<String> result = new ArrayList<>();
        if (line != null){
            String[] splitData = line.split(",");
            for (int i = 0; i < splitData.length; i++){
                result.add(splitData[i]);
            }
        }
        return result;
    }
    public static void printCountry(List<String> country){
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader("country.csv"));
            while ((line = bufferedReader.readLine())!=null){
                printCountry(parseCsvLine(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

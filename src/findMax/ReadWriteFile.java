package findMax;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> number = new ArrayList<>();
        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                number.add(Integer.parseInt(line));
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }
    public void writeFile(String filePath, int max){
        try {
            FileWriter fileWriter = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là: "+max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

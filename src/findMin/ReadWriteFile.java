package findMin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    List<Integer> readFile(String filePath){
        List<Integer> nums = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lineValue;
            while ((lineValue = bufferedReader.readLine())!= null){
                nums.add(Integer.parseInt(lineValue));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại or file lỗi");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nums;
    }
    void writeFile(String filePath, int min){
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị nhỏ nhất là: "+ min);
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("File không tồn tại or file lỗi");
        }
    }
}

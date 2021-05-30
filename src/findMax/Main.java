package findMax;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadWriteFile readWriteFile = new ReadWriteFile();
        FindMax findMax = new FindMax();
        List<Integer> numbers = readWriteFile.readFile("numbers.txt");
        int max = findMax.findMaxValue(numbers);
        System.out.println(max);
        readWriteFile.writeFile("numbers.txt",max);
    }
}
package findMin;

import java.util.List;

public class Main {
    public static int findMin(List<Integer> nums){
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++){
            if (min > nums.get(i)){
                min = nums.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ReadWriteFile readWriteFile = new ReadWriteFile();

        List<Integer> nums = readWriteFile.readFile("numbers.txt");
        int minValue = findMin(nums);
        readWriteFile.writeFile(".idea/ketqua.txt", minValue);
    }
}

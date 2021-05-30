package findMax;

import java.util.List;

public class FindMax {
    public int findMaxValue(List<Integer> number){
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++){
            if (max < number.get(i)){
                max = number.get(i);
            }
        }
        return max;
    }


}

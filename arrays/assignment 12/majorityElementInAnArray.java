import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class majorityElementInAnArray{
    public int majorityElement(int []nums){

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.computeIfPresent(nums[i],(key,value) -> value+1);
            }else{
                map.put(nums[i],1);
            }
        }
        // System.out.println(map);
        int minvalue = Integer.MIN_VALUE;
        for( int value : map.values()){
            if(value > minvalue){
                minvalue = value;
            }
        }
        for(Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==minvalue){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {3,2,3};
        majorityElementInAnArray m = new majorityElementInAnArray();
        System.out.println(m.majorityElement(arr));
    }
}
package Array;
import java.util.*;

public class IndexesofSubarraySum {
        static ArrayList<Integer> subarraySum(int[] arr, int target) {
            // code here
            ArrayList<Integer> a = new ArrayList<>();
            int sum = 0;
            int stind = 0;
            int endind = 0;
            for(int i =0; i<arr.length;i++){
             int j =i+1;
             while(j<arr.length || sum==target){
                 stind = i;
                 sum += arr[i];
                 endind = j;
                 j++;
             }
            }
            a.add(stind);
            a.add(endind);
            return a;
        }

    static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        ArrayList<Integer> a = subarraySum(arr,12);
        System.out.println(a);

    }

    }

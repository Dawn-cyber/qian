package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2161 {
    public static void main(String[] args) {
        int[] nums = new int[]{-9,12,5,10,14,3,10};
        int pivot = 10;
        int count =0,len = nums.length;
        List<Integer> less = new ArrayList<>();
        List<Integer> more = new ArrayList<>();
        for (int i=0;i<len;i++){
            if(nums[i]<pivot){
                less.add(nums[i]);
            }
            if(nums[i]>pivot){
                more.add(nums[i]);
            }
            if(nums[i]==pivot){
                count++;
            }
        }
        int i=0;
        for(;i<less.size();i++){
            nums[i] = less.get(i);
        }
        while (count>0){
            nums[i] = pivot;
            i++;
            count--;
        }
        int j = more.size();
        for (int k=0;k<j;k++){
            nums[i] = more.get(k);
            i++;
        }

        for (int k = 0; k < len; k++) {
            System.out.print(nums[k]+" ");
        }

    }
}

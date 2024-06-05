package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode131 {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        int length = s.length();
        List<String> temp = new ArrayList<>();
        for(int i=0;i<length;i++){
            temp.add((s.substring(i,i)));
        }

        return ans;
    }
}

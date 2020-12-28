package leetcode2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test1213 {
    public static void main(String[] args) {
        String test[]={"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(test);
    }
    /**给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串*/
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists=new ArrayList<>();
        if (strs.length<=0){//长度不对
            return null;
        }else if(strs.length==1){//长度为1
            List<String> list1=new ArrayList<>();
            list1.add(strs[0]);
            lists.add(list1);
            return lists;
        }
        HashMap<String,ArrayList<String>> strMap=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=String.valueOf(ch);
            if (!strMap.containsKey(key)){
                strMap.put(key,new ArrayList<>());
            }
            strMap.get(key).add(s);
        }
        return new ArrayList<>(strMap.values());
    }
}

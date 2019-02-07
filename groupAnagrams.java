class Solution {
      public List<List<String>> groupAnagrams(String[] strs) {  
        List<List<String>> result = new ArrayList<>();  
        Map<String, List<String>> map = new HashMap<>();  
        for(String s : strs) {  
            char[] chars = s.toCharArray();  //将字符串转换位字符数组
            Arrays.sort(chars);  //对字符数组进行排序
            String key = String.valueOf(chars);  //字符chars排序后得到的串
            if(!map.containsKey(key)) map.put(key, new ArrayList<>());  
            map.get(key).add(s);  
        }  
        for(String key : map.keySet()) {  //将value值从map里取出来，进行排序后放入result中
            List<String> list = map.get(key);  
            Collections.sort(list);  
            result.add(list);  
        }  
        return result;  
    }  
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap();
       
         
        for(int i = 0; i < strs.length; i++)
        {
            int[] arr = new int[26];
            for(int j = 0; j < strs[i].length(); j++)
            {
                arr[strs[i].charAt(j)-'a']++;     
            }
  
            String str = Arrays.toString(arr);
            List<String> list = map.getOrDefault(str, new ArrayList<String>());         
            list.add(strs[i]);    
            map.put(str,list);
        }
        return new ArrayList<List<String>>(map.values());
    }
        
}

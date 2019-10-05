class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        
        int max = 0;
        int[] arr = new int[128];
        for(int i = 0; i < arr.length; i++)
            arr[i] = -1;
        int index = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i); 
            if(arr[c] >= index)
            {
                max = i-index > max? i-index:max;
                index = arr[c] + 1;                
            }
            arr[c] = i;
        }
        
        return max > s.length()-index? max:s.length()-index;
    }
}

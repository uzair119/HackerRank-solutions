class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0)
            return 0;
        int[] arr = new int[amount+1];
        Arrays.fill(arr,amount+1);
        arr[0] = 0;
        Arrays.sort(coins);
        if(coins[0] > amount)
            return -1;
        int count = 0;
     
        for(int i = 1; i < arr.length; i++)
        {
            for(int j = 0; j < coins.length; j++)
            {
                if(i < coins[j])
                    break;
                arr[i] = arr[i-coins[j]] + 1 < arr[i] ? arr[i-coins[j]] + 1: arr[i];                
            }
        }
        return arr[amount] == amount+1? -1 : arr[amount];
        
    }
}

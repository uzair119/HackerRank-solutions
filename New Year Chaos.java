import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] arr) {
        int bribe = 0;
        int curr = 0;
        for(int i = 0; i < arr.length; i++)
        {
        if(arr[i]-(i+1) > 2)
            {
                System.out.println("Too chaotic");
                return;
            }
        }
        for(int i = 0; i < arr.length-1; i++)
        {
            curr = 0;
        
            for(int j = 0; j < arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    curr++;
                    bribe++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(curr == 0)
                break;
        }
        System.out.println(bribe);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

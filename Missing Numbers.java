import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the missingNumbers function below.
    static ArrayList<Integer> missingNumbers(ArrayList<Integer> arr, ArrayList<Integer> brr) {
        for(int i = 0; i < arr.size(); i++)
        {
            if(brr.contains(arr.get(i)))
                brr.remove(arr.get(i));
        }
        Collections.sort(brr);
        return brr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        ArrayList<Integer> list1 = new ArrayList();
        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            list1.add(arrItem);
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<Integer> list2 = new ArrayList();

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            list2.add(brrItem);
        }

        ArrayList<Integer> result = missingNumbers(list1, list2);
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < result.size(); i++) {
            if(set.contains(result.get(i)))
                continue;
            bufferedWriter.write(String.valueOf((result).get(i)));
            set.add(result.get(i));
            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

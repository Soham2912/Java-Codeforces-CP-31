import java.util.*;

public class HalloumiSorter {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] sorted = arr.clone();
            Arrays.sort(sorted);

            if(Arrays.equals(sorted,arr) || k > 1){
                System.out.println("YES");
            }else{
                 System.out.println("NO");
            }

        }  
    }
}

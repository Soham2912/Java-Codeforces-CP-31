import java.util.*;;

public class LineTrip {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(0);
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                arr.add(a);
            }
            arr.add(x);
            
            n = arr.size();
            
           // int minFuel = 0;
            int maxDiff = Integer.MIN_VALUE; ;
            for(int i = 1 ;i < n ;i++){
                if(i == n-1){
                    maxDiff= Math.max(maxDiff,2*(arr.get(i)-arr.get(i-1)) );

                }else{
                    maxDiff = Math.max(maxDiff,arr.get(i)-arr.get(i-1) );
                }

            }

            System.out.println(maxDiff);

        }

    }
}

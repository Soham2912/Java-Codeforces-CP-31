import java.util.Scanner;

public class bb {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0 ; i<t; i++){
                int n =sc.nextInt();
                int a[] = new int[n];

                for(int j = 0; j<n;j++){
                    a[j] = sc.nextInt();
                }

                int good=0;
                long sum=0;

                for(int j:a){
                    sum+=j;
                   
                    if (sum - j == j) {   
                            good++;
                        
                    }

                    System.out.println(good);
                }
        }

        sc.close();
    }
}

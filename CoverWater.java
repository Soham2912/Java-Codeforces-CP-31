
import java.util.*;

public class CoverWater{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();

            int cnt = 0 ;
            boolean flag = false;
            int i  =  0 ; 
           if(n>=3){
             while(flag == false && i<n-2 ){
                String sub = str.substring(i, i + 3);
                if(!sub.contains("#")){
                    cnt +=2;
                    flag = true;
                }
                i++;
                
            }

           }

            if(cnt == 0){
                for(int j = 0; j < n; j++){
                    if(str.charAt(j) == '.'){
                        cnt++;
                    }

                }
            }
            System.out.println(cnt);

        }
    }


}
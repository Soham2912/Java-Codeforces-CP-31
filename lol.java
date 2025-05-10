import java.util.Scanner;
public class lol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int t = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < t; i++) {
        
            String a = sc.next();
            String b = sc.next();
            
            
            String newA = b.charAt(0) + a.substring(1);
            String newB = a.charAt(0) + b.substring(1);
            
          
            System.out.println(newA + " " + newB);
        }
        
        sc.close();
    }
}

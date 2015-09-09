
import java.io.IOException;
import java.util.Scanner;


public class Test01 {

 
    public static void main(String[] args) throws IOException{
          
        try { Scanner sc=new Scanner(System.in);
    System.out.println("請輸入您的眼鏡度數");
      System.out.print(">>");
        int a=sc.nextInt();
        
        float f1=-0.01f*a;
          
          float f2=f1/(1-0.012f*f1);
       
          float b=(int)(f2*-100);
          System.out.println("您適合的隱形眼鏡度數:"+b);
            
        } catch (Exception e) {System.out.println("請輸入正確的眼鏡度數(半形數字且非小數點)");
        }
   
    }
    
}

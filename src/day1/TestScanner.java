package day1;
import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
           for(int i=0;i<3;i++){
               if(sc.hasNext()){
                  System.out.println(" checking..." + i);
                  
               }               
                String s1=sc.next();                
                int x= Integer.parseInt(sc.next());
               
               
                String str="";
                if(x>=10 && x<=99){
                    str="0"+x;
                }              
                else if(x<10){
                    str="00"+x;
                }
                else{
                    str=""+x;
                }
                
                 int spaceLength=15-s1.length();   
                 for(int n=0;n<spaceLength;n++){
                     
                    s1=s1+" "; 
                    
                 }
                 
                
                System.out.println(s1+str+'\n');
           }
                
            
            sc.close();
            System.out.println("================================");

    }
    }
    




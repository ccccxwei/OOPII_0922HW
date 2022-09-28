import java.util.*;

public class hw1 {
    public static void main(String[] args){

        TreeSet<Integer> set = new TreeSet<>();
        
        int i=1;
          
        while(i<=10){
          
          int randomnum = (int)(Math.random()*100)+1;
          set.add(randomnum);
          System.out.println("第 " + i + " 個號碼：" + randomnum);
          i++;
   
        }

        System.out.println("物件內元素個數為: " +(i-1));
        System.out.println("物件內元素的內容: " +set);
        System.out.println("第一個元素內容為: " +set.first());
        System.out.println("最後一個元素內容: " +set.last());
        System.out.println("內容介於30~70者為" +set.subSet(30,70));
        }
 }



        


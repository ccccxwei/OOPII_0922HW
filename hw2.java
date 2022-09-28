import java.util.*;

public class hw2 {
    public static void main(String[] args){

        HashMap<String, String> map = new HashMap<>();
        map.put("1", "January");
        map.put("2", "February" );
        map.put("3", "March");
        map.put("4", "April" );
        map.put("5", "May");
        map.put("6", "June");
        map.put("7", "July");
        map.put("8", "August");
        map.put("9", "September");
        map.put("10", "October");
        map.put("11", "November");
        map.put("12", "December");

        
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入1~12?");
        String month = sc.nextLine();
        
        if(map.get(month) != null){
            System.out.println("第" +month+ "月的英文單字為: "  +map.get(month));
        }
        else{
            System.out.println("範圍錯誤!");
        }
        
    }
        
}

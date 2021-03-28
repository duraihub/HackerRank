import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String timeSplit[]=s.split(":");
        int hours=Integer.parseInt(timeSplit[0]);
        
        if(hours==12 && s.contains("AM")){
            hours=00;
            s="00"+":"+timeSplit[1]+":"+timeSplit[2];
        }else if(hours!=12 && s.contains("PM")){
            hours=hours+12;
            s=hours+":"+timeSplit[1]+":"+timeSplit[2];  
        }
        
           return  s=s.substring(0,s.length()-2);
        

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

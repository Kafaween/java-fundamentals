package linter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerRead {
    public static void main(String[] args) {
        Scan("./app/src/main/resources/gates.js");
    }
    public static String Scan(String path) {
        File file = new File( path);
        Scanner sc;
        int counter =1;
        boolean test=false;

        try {
            sc = new Scanner(file);
            // Check if there is another line of input
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                if(!(!str.endsWith(";") && (str.endsWith("}") || str.endsWith("{") || str.contains("if") || str.contains("else") || str.equals("")))){
                    System.out.println("Line "+ counter+": Missing semicolon.");
                    test=true;


                }
//                System.out.println("" + str);
                counter++;
            }
            if(test==false){
                System.out.println("No errors have been found nice jov Dev");
                return "No errors have been found nice jov Dev";
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return  "Line "+ counter+": Missing semicolon.";
    }
}

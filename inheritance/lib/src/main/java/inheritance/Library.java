/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public static void main(String[] args) {
        System.out.println("hi");
        Restaurant res1= new Restaurant("haniny",4,"$$");
        System.out.println(res1.toString());
//        Review rev1=new Review("its a goood res","kafaween",3);
        res1=new Review("its a goood res","kafaween",3);
        System.out.println(res1.toString());
        res1=new Review("its a goood res","kafa",2);
        System.out.println(res1.toString());
    }
}

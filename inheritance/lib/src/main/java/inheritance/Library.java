/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public static void main(String[] args) {
        System.out.println("hi");
        Restaurant res1= new Restaurant("haniny","$$");
//        System.out.println(res1.toString());
        Review rev1=new Review("its a goood res","kafaween",3);
        res1.addReview(rev1);
            Review rev2=new Review("its a goood res","kafa",2);
        res1.addReview(rev2);
        System.out.println(res1.toString());
        Restaurant res2= new Restaurant("burgarize","$$");
        Review rev3=new Review("its a goood res","kafawee",5);
        res2.addReview(rev3);
        Review rev4=new Review("its a goood res","kaf",5);
        res2.addReview(rev4);
        System.out.println(res2.toString());
    }
}

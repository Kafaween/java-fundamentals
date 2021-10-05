/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
//    @Test void test1() {
//        Restaurant res1= new Restaurant("haniny","$$");
//        assertEquals("Restaurant{name='haniny', rate=0.0, price_category='$$', list_of_reviews=[]}", res1.toString());
//    }
//    @Test void test2() {
//        Review rev1=new Review("its a goood res","kafaween",3);
//        assertEquals("Review{body='its a goood res', author='kafaween', num_stars=3.0}", rev1.toString());
//    }
//    @Test void test3() {
//        Review rev1=new Review("its a goood res","kafaween",3);
//        assertEquals("Review{body='its a goood res', author='kafaween', num_stars=3.0}", rev1.toString());
//    }
//    @Test void test4() {
//        Restaurant res1= new Restaurant("haniny","$$");
//        Review rev1=new Review("its a goood res","kafaween",3);
//        res1.addReview(rev1);
//
//        assertEquals("new rating have been added", res1.addReview(rev1));
//    }
//    @Test void test5() {
//        Restaurant res3= new Restaurant("mac","$$$");
//        Review review=new Review("nice","asd",0);
//        res3.addReview(review);
//        Review review2=new Review("nice","asdasdasd",3);
//        Review review3=new Review("nice","asdasdaaasd",3);
//        res3.addReview(review2);
//        res3.addReview(review3);
//        assertEquals("Restaurant{name='mac', rate=1.5, price_category='$$$', list_of_reviews=[Review{body='nice', author='asd', num_stars=0.0}, Review{body='nice', author='asdasdasd', num_stars=3.0}, Review{body='nice', author='asdasdaaasd', num_stars=3.0}]}", res3.toString());
//    }
@Test void test6() {
    Shop shop1=new Shop("hamodeh","nice shop","$");
        assertEquals("Shop{name='hamodeh', rate=0.0, price_category='$', list_of_reviews=[]}", shop1.toString());
    }
    @Test void test7() {
        Shop shop1=new Shop("hamodeh","nice shop","$");
        Review review1=new Review("best place","kafaween",5);
        Restaurant restaurant1=new Restaurant("haniny","$");
        restaurant1.addReview(review1);
        shop1.addReview(review1);
        assertEquals("Shop{name='hamodeh', rate=5.0, price_category='$', list_of_reviews=[Review{body='best place', author='kafaween', num_stars=5.0}]}", shop1.toString());
        assertEquals("Restaurant{name='haniny', rate=5.0, price_category='$', list_of_reviews=[Review{body='best place', author='kafaween', num_stars=5.0}]}", restaurant1.toString());
    }
    @Test void test8() {
        Theatre theatre1=new Theatre("shams");

        assertEquals("fight club have been added", theatre1.addMovies("fight club"));
        assertEquals("bird man have been removed", theatre1.removeMovies("bird man"));


    }
    @Test void test9() {
        Theatre theatre1=new Theatre("shams");
       theatre1.addMovies("fight club");
        theatre1.addMovies("bird man");
       theatre1.addMovies("usual suspect");
       theatre1.removeMovies("bird man");

        assertEquals("Theatre{name='shams', movies=[fight club, usual suspect], rate=0.0, list_of_rates=[]}", theatre1.toString());

    }
    @Test void test10() {
        Theatre theatre1=new Theatre("shams");
        System.out.println(theatre1.addMovies("fight club"));
        System.out.println(theatre1.addMovies("bird man"));
        System.out.println(theatre1.addMovies("usual suspect"));
        System.out.println(theatre1.removeMovies("bird man"));
        Review review_theatre=new Review("good theatre","abed",4);
        Review review_based_movie=new Review("nice movie nice service","kafaween",5);
        theatre1.addReview(review_theatre);




        assertEquals("Theatre{name='shams', movies=[fight club, usual suspect], rate=4.0, list_of_rates=[Review{body='good theatre', author='abed', num_stars=4.0}]}", theatre1.toString());
        theatre1.addReviewmovie(review_based_movie,"fight club");
        assertEquals("Theatre{name='shams', movies=[fight club, usual suspect], rate=4.5, list_of_rates=[Review{body='good theatre', author='abed', num_stars=4.0}, Review{body='nice movie nice service', author='kafaween', num_stars=5.0}]}", theatre1.toString());

    }

}

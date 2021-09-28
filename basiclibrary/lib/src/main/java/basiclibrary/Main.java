package basiclibrary;
import java.util.Arrays;
import java.util.Random;

import static java.lang.Long.MAX_VALUE;

public class Main {

        public static void main(String[] args) {
                int[] ans =roll(6);
                System.out.println(Arrays.toString(ans));
                int[] test_array={1,4,5,1,3};
                System.out.println(containsDuplicates(test_array) );
                System.out.println(average(test_array) );
                int[][] weeklyMonthTemperatures = {
                        {66, 64, 58, 65, 71, 57, 60},
                        {57, 65, 65, 70, 72, 65, 51},
                        {55, 54, 60, 53, 59, 57, 61},
                        {65, 56, 55, 52, 55, 62, 57}
                };
                System.out.println(averageOfArrays(weeklyMonthTemperatures)) ;
        }

        public static int[] roll(int n){
                Random rand = new Random();
                int[] arr= new int[n];
                int index =0;
                while(n>0){
                int int_random = rand.nextInt(6);
                arr[index]=int_random;
                index++;
                n--;


                }
                return arr;
        }
        public static boolean containsDuplicates(int[] arr){
                boolean x=false;
                for(int i=0 ;i<arr.length-2;i++){
                       for(int y=i+1;y<arr.length-1;y++){
                               if(arr[i]==arr[y]){
                                       x= true ;
                               }
                       }

                }
              return x;
        }

        public static double average(int[] arr){
                double sum=0;
                for(int i=0 ;i<arr.length;i++){
                        sum=sum+arr[i];

                }
                double avg=sum/arr.length;
                return  avg;
        }
        public static double averageOfArrays(int[][] arr){
                double smallest=MAX_VALUE;
                for(int x=0;x<arr.length;x++){
                double sum=0;

                for(int i=0 ;i<arr[x].length;i++){


                        sum=sum+arr[x][i];

                }

                double avg=sum/arr[x].length;

                if(smallest>avg){
                        smallest =  avg;
                }

        }
                return smallest;
        }




}
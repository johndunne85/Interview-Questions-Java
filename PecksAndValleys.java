import java.util.Collections;
import java.util.Arrays;

/**
 * Created by johndunne on 30/08/2017.
 */
public class PecksAndValleys{

    public static void main(String[] args){


      int[] ar = {0,1,4,7,8,9};

      int[] arr = new int[ar.length];

      Arrays.sort(ar);

      for(Integer x: ar){
          System.out.print(x+" ");
      }
      System.out.println();

      int len = ar.length;
        int j=0, i=0,m=0;

      while(i < len){

          if(i%2 == 1){
              arr[i] = ar[j];
              i++; j++;
          }

          else if(i%2==0){
              arr[i] = ar[len-1-m];
              i++; m++;

          }


      }//while

        for(Integer x: arr){
            System.out.print(x+" ");
        }



    }

}

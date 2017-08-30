/**
 * Created by johndunne on 30/08/2017.
 * cracking the coding interview ch 10 question 9
 */
public class SortedMatrixSearchCH109 {


    public static void main(String[] args){

        int[][] ar = {{01,02,03,04,05,06,07},
                      {11,12,13,14,15,16,17},
                      {21,22,23,24,25,26,27},
                      {31,32,33,34,35,36,37},
                      {41,42,43,44,45,46,47},
                      {51,52,53,54,55,56,57},
                      {61,62,63,64,65,66,67},
                      {71,72,73,74,75,76,77}
                                             };


        System.out.println(search(ar,26));



    }
    public static String search(int[][]ar, int key){


        int lower = 0, upper = ar.length;

        while(true) {
            if(lower >= upper || key > ar[ar.length-1][ar[0].length-1]){
                break;
            }

            int mid = (upper + lower) / 2;

            if(key > ar[mid][ar[0].length-1]){
                lower = mid+1;

            }//if
            else if(key < ar[mid][ar[0].length-1]){
                upper = mid;
            }
            else{

                return "row"+mid+" col 0";
            }


        }//while

        for(int i=0;i<ar[lower].length;i++){
            if(key == ar[lower][i]){
                return "row "+lower+" col "+i;
            }
        }

        return "-1";
    }// end of search


}

/**
 * Created by johndunne on 30/08/2017.
 */
public class PeaksAndValleysBookAns {

    public static void main(String[] args){

        int[] ar = {9,1,0,4,8,7};

       sortValleys(ar);

       for(Integer x: ar){
           System.out.print(x+" ");
       }


    }
    public static void sortValleys(int[] array){
        for(int i=1;i<array.length;i +=2){
            int biggestIndex = maxIndex(array, i-1, i , i+1);
            if(i != biggestIndex){
                swap(array,i,biggestIndex);
            }
        }
    }
    public static int maxIndex(int[] array,int a, int b, int c){
        int len = array.length;
        int aValue = a >= 0 && a< len ? array[a] : Integer.MIN_VALUE;
        int bValue = b >= 0 && b< len ? array[b] : Integer.MIN_VALUE;
        int cValue = c >= 0 && c< len ? array[c] : Integer.MIN_VALUE;

        int max = Math.max(aValue, Math.max(bValue, cValue));
        if(aValue == max){
            return a;
        }
        else if(bValue == max){
            return b;
        }
        else{
            return c;
        }
    }
    public static void swap(int[]ar , int a, int b){
        int temp =0;
        temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }

}

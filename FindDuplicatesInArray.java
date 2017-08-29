/**
 * Created by johndunne on 29/08/2017.
 */
public class Bit {

    public static void main(String[] args){

        int[] ar = {3,4,5,6,7,8,4,6};
        check(ar);


    }
    public static void check(int[] array){
        BitSet bs = new BitSet(32000);
        for(int i=0;i< array.length; i++){
            int num = array[i];
            int num0 = num -1;
            if(bs.get(num0)){
                System.out.print(num);
            }
            else{
                bs.set(num0);
            }
        }
    }
    public static class BitSet{
        int[] bitset;
        public BitSet(int size){
            bitset = new int[(size >> 5)+1];
        }
        boolean get(int pos){
            int wordNumber = (pos >> 5);
            int bitNumber = (pos & 0x1F);
            return(bitset[wordNumber] & (1 << bitNumber)) !=0;
        }
        public void set(int pos){
            int wordNumber = (pos >> 5);
            int bitNumber = (pos & 0x1F);
            bitset[wordNumber] |= 1 << bitNumber;
        }
    }
}

package porche;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Character> list = new LinkedList<>();
		list.add('n');
		list.add('a');
		list.add('n');
		list.add('a');
		list.add('n');
		
		for(Character x: list){
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println(checkPalindrome(list));
	
		
	
	
		
		
	}
	
	public static boolean checkPalindrome(LinkedList<Character> list){
		boolean x = false;
		if(list.size() == 1 || list.size() == 0){
			return true;
		}
		
		else if(list.getFirst() == list.getLast()){
			list.removeFirst();
			list.removeLast();
			x  = checkPalindrome(list);
		}
		
		
			return x;
		
		
			
		
		
		
		
		
	}// end of method checkPalindrome

}

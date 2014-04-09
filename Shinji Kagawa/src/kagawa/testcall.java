package kagawa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class testcall {

	public static void main(String[] args) {
		Kagawa obj = new Kagawa ();
		Kagawa obj1 = new Kagawa (1);
		String name = obj.getname();
		String position = obj.getposition();
		String[] friend = obj.getfriend();

		System.out.println("Name = "+ name ) ;
		System.out.println("position = "+ position ) ;
		System.out.println("friend = "+ Arrays.toString(friend) ) ;
	}

}

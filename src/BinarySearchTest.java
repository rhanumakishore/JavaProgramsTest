import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

	public static void main(String[] args) {
		BinarySearchExample addr1 = new BinarySearchExample("abc","def");
		BinarySearchExample addr2 = new BinarySearchExample("ghi","jkl");
		BinarySearchExample addr3 = new BinarySearchExample("asdsadf","dgjgdhj");
		BinarySearchExample addr4 = new BinarySearchExample("fgdssrg","dggfdjhfdgjhjgdhj");
		BinarySearchExample addr5 = new BinarySearchExample("asdfaggdgf","dfsgtfhg");
		List list = new ArrayList();
		list.add(addr1);
		list.add(addr2);
		list.add(addr3);
		list.add(addr4);
		list.add(addr5);
		
		int pos = Collections.binarySearch(list, new BinarySearchExample("fgdssrg","dggfdjhfdgjhjgdhj"));
		System.out.println(pos);
		BinarySearchExample bin = (BinarySearchExample) list.get(pos);
		System.out.println(bin.getCity()+"-------------------"+bin.getState());
		

	}

	
}

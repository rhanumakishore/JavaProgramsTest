import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistTest {
	private static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list  = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		for(int n : list)
		{
			if(n%2 != 0)
			{
				count++;
				if(count%2 != 0)
				System.out.println(n);
			}
		}

	}

}

package swapArray;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SwapFirstAndLast {
	
	public String swap(int [] num) {
	int temp=num[0];
	int last=num[num.length-1];
	num[0]=last;
	num[num.length-1]=temp;
	Arrays.toString(num);
	return Arrays.toString(num);
	}
	@Test
	public void testcase() {
		int[]num = {1,2,3,4};
		Assert.assertEquals(swap(num).toString(), "[4, 2, 3, 1]");
	}

}

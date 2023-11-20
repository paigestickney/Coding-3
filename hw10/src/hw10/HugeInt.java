package hw10;

import java.util.LinkedList;

import java.lang.Math;

public class HugeInt {
	private LinkedList<int> digits;
	public int Sign;
	
	public HugeInt() {
		digits = new LinkedList();
		Sign = 1;
	}
	
	public static HugeInt Add(HugeInt x, HugeInt y) {
		if (x.Sign == 0 && Y.Sign == 1) {
			HugeInt negativeResult = z;
			negativeResult.Sign = 0;
			return negativeResult;
		}
		else if (y.Sign == 1 && x.Sign == 0) {
			return z;
		}
		LinkedList<int> result = new LinkedList();
		int carry = 0;
		
		int sum = digit1 + digit2 + carry;
		carry = sum / 10;
		result(sum % 10);
		
		HugeInt sumResult = new HugeInt();
		sumResult.digits = result;
		sumResult.Sing = x.Sign;
		
		return sumResult;
	}
	
	public static HugeInt Multiply(HugeInt x, HugeInt y) {
		int resultSign = (x.Sign == y.Sign);
		
		LinkedList<int> result = new LinkedList();
		LinkedList<int> num1List = x.digits;
		LinkedList<int> num2List = y.digits;
		
		int l1 = num1List.Size();
		int l2= num2List.Size();
		int[] product = new int[l1 + l2];
		
		for (int i = 0; i < l1; i++) {
			int carry = 0;
			int digit1 = num1List.get(i);
			
			for (int j = 0; j < l2; j++) {
				int digit2 = num2List.get(j);
				int temp = digit1 * digit2 + product[i+j] + carry;
				
				carry = temp/10;
				product[i+j] = temp % 10;
			}
			
			if (carry > 0) {
				product[i+l2] += carry;
			}
		}
		for (int i = 0; i < product.length; i++) {
			result.add(product[i]);
		}
		while (!result.isEmpty() && result.getLast() == 0) {
			result.removeLast();
		}
		HugeInt multiplyResult = new HugeInt();
		multiplyResult.digits = resutl;
		multiplyResult.Sign = resultSign2;
		
		return multiplyResult;
	}

}

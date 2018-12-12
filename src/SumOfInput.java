
/**
 * 

Given an integer, find the sum of all its digits.

Example

For n = 111, the output should be
digitSum(n) = 3.

1 + 1 + 1 = 3.

Input/Output

[time limit] 3000ms (java)
[input] integer n

Constraints:
0 ≤ n ≤ 2 · 109.

[output] integer


 * @author edwinanto
 *
 */
public class SumOfInput 
{
	int digitSum(int n) 
	{
		int sum = 0;
		while(n>0)
		{
			sum+=n%10;
			n=n/10;
		}

		return sum;
	}
	public static void main(String[] args) 
	{
		SumOfInput s = new SumOfInput();
		s.digitSum(2221);
	}

}

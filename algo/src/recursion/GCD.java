// Need to Done GCD Algo
package recursion;

import org.junit.Test;
import org.junit.Assert;
import java.lang.Math;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


/**
	Problem:
	GCD is Greatest common divisor. In the school math we studied this. Eg. :
		GCD for 12 & 4 = 4 because 4 can divide both 12 and 4 And No number greater than 2 can do that.
		GCD for 10 & 4 = 2 because 2 can divide both 10 and 4. And No number greater than 2 can do that.
		GCD for 7 & 11 = 1 because 1 can divide both 7 and 11. And No number greater than 1 can do that.
		
	Solution:
	Here below I have written 5 variations to solve GCD. 
		gcd1() <- Euclidean RECURSION algorithm. Uses Subtraction a-b to reduce the argument until it becomes 0
		gcd2() <- Euclidean RECURSION algorithm. Uses  Modulus a%b to reduce the argument until it becomes 0
		gcd3() <- Euclidean RECURSION algorithm. Uses  Modulus a%b to reduce the argument until it becomes 0
		gcd4() <- Euclidean ITERATIVE algorithm. Uses  Modulus a%b to reduce the argument until it becomes 0
		gcd5() <- Binary RECURSION algorithm.
	
	Asymptotic analysis:
	Reference: https://stackoverflow.com/a/59264770/1316967
	Time complexity= O(log n) where n is the upper limit of a and b
	Space complexity= O(1) in case of Iterative solution
	Space complexity=O(log n) in case of Recursive solution where n is the upper limit of a and b. This is because in recursion tree, each stack of recursion occupies some space in memory. In Iterative approach this is not required.
	
**/

public Class GCD
{

@Test
public void gcdCheck()
{
   System.out.println("testing started\n");
   Assert.assertEquals(4l, gcd(12,4));
}

/*
First algorithm
*/
private long gcd1(Long a, Long b)
{
  long gcd = 0;
  if(a == 0)
  {
      gcd = b;
  }
  else 
  {
  if(a > b)
  {
      gcd =gcd1(a - b, a)
  }
  else
  {
      gcd =gcd1(b - , a)
  }
  }
  return gcd;
}
}
}

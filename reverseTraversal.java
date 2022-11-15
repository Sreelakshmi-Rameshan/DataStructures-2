/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    int[] a = {0,-1};
    System.out.println(a.length);
    System.out.println(Arrays.toString(cloneEvenNumbers(a)));
  }
  public static int[] cloneEvenNumbers(int[] a) 
  {    
    if (a == null || a.length == 0)
    {
      return a;
    }
    int end = a.length;
    int i=findLastNumber(a);
    while(i>=0)
    {
      if(a[i]%2 == 0)
      {
        a[--end]=a[i];
      }
      a[--end]=a[i];
      i--;
    }
  return a;
}
public static int findLastNumber(int[] a)
{
  int i=a.length-1;
  while(i>=0 && a[i]== -1)
  {
    i--;
  }
  return i;
}
}
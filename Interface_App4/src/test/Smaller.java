package test;

public class Smaller implements IComparable {
   public  int compareTo(int x,int y, int z) {
	   if(x<y && x<z)  return x;
	   
	   else if(y<x && y<z)  return y;
	   
	   else return z;
   }
}

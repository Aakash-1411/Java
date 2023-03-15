package com.main.cls;
import com.avg.no.*;
import java.util.*;
public class Ans {

	public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          Average a = new Average();
          System.out.println("x : ");
          a.x = s.nextDouble();
          System.out.println("y : ");
          a.y = s.nextDouble();
          System.out.println("z : ");
          a.z = s.nextDouble();
          
          a.calculate();
          
          s.close();
	}

}

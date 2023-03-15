package com.main.cls;
import com.cal.rec.area.*;
import java.util.Scanner;
public class ReactangleArea {

	public static void main(String[] args) {
		 Area a = new Area();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Rectangle Length : ");
         a.length = s.nextInt();
        System.out.println("Enter Rectangle width : ");
         a.width = s.nextInt();
        
        
        int area = a.getArea();
        System.out.println("Area of Rectangle : "+area);
        s.close();
	}

}

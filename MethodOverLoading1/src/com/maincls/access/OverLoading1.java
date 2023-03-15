package com.maincls.access;

public class OverLoading1 {

	public static void main(String[] args) {
        
		Student st = new Student();
		
		st.m1();
		st.m1(10,"Aakash");
		st.m1("Purab", 20);
		st.m1(3.54, 30);

	}

}

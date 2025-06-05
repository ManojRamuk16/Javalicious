package com.essentials;

public class Boxing {
	public static void main(String[] args) {
		int i=10;
		float f = 24.23f;
		byte b = 10;
		short s =20;
		long l = 40;
		double d = 89.999;
		char c ='a';
		boolean bool = true;
		
		//Auto BOxing : converting primitive data types values into its corresponding wrapper class
		Integer exp = Integer.valueOf(10);//converting int into Integer explicitly
		Integer intobj =i;//compiler will write Integer.valueOf(a) internally
		
		Float floatobj =f;
		Byte byteobj =b;
		Short shortobj =s;
		Long longobj =l;
		Double doubleobj =d;
		Character charobj = c;
		Boolean boolobj = bool;
//		System.out.println(intobj);
//		System.out.println(floatobj);
//		System.out.println(byteobj);
//		System.out.println(shortobj);
//		System.out.println(longobj);
//		System.out.println(doubleobj);
//		System.out.println(charobj);
//		System.out.println(boolobj);
//		,floatobj,byteobj,shortobj,longobj,doubleobj,charobj,boolobj);
		
		//Unboxing : Converting objects to primitive data types
		int idt = intobj +1;
		System.out.println(idt);
		float fdt = floatobj + 1.2f;
		byte bdt = byteobj;
		System.out.println(fdt);
		System.out.println(bdt);
		short sdt = shortobj;
		System.out.println(sdt);
		long ldt = longobj;
		System.out.println(ldt);
		double ddt = doubleobj;
		System.out.println(ddt);
		char cdt = charobj;
		System.out.println(cdt);
		boolean boodt = boolobj;
		System.out.println(boodt);
		
		
	}
}

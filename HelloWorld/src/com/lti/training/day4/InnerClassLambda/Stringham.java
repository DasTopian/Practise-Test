package com.lti.training.day4.InnerClassLambda;

public class Stringham {
	
	public static void main(String[] args) throws InterruptedException {
		
		String s1="Java"; //Object created in string pool;
		String s2="Java"; //Object created in string pool
		String s3=new String("Java"); //Object created outside string pool
		String s4=new String("Java"); //Object created outside string pool
		System.out.println(s1==s2); //true
		System.out.println(s3==s4); //false; two separate objects are being created
		//System.out.println(s3.equals(s4)); 
		String s5="JAVA";
		String s6=s1.toUpperCase();  //string is immutable - any alteration to the string results in separate object being formed
		System.out.println(s5.equals(s6));
		String s7="Hello";
		String s8="World";
		String s9="HelloWorld";
		//String s10=s7+s8; //runtime alteration so not in string pool
		String s10=(s7+s8).intern(); //intern is pooling; it finds reference to same string in the pool
		System.out.println(s9==s10);
		//System.out.println(s9.equals(s10));
		String str="kjdgsdhhsdgvdvdv1`267563hgvvdltikimaakabhsdahdkhvdvdhsdhvcvhcjdhvdjhvdjgdhf ";
		String newstr="";
		System.out.println("--------------using string concatenation---------------------");
		long ns1=System.nanoTime();
		for(int i=0;i<str.length();i++)
			for(int j=0;j<=i;j++)
				newstr+=str.charAt(j);
		
		long ns2=System.nanoTime();
		System.out.println("Result ::"+newstr);
		System.out.println("Approx time taken: "+(ns2-ns1)+"nanosecs");
		
		
		System.out.println("-----------------------using string buffer-----------------");
		StringBuffer strbuffer = new StringBuffer();
		long n11=System.nanoTime();
		for(int i=0;i<str.length();i++)
			for(int j=0;j<=i;j++)
				strbuffer.append(str.charAt(j));
		
		long n12=System.nanoTime();
		System.out.println("Result ::"+newstr);
		System.out.println("Approx time taken: "+(n12-n11)+"nanosecs");
		/*for(int i=0;i<100;i++) {
			Thread.sleep(1000);
			System.out.println(i);
		}*/
		
		System.out.println("----------------------using string builder---------------------");
		StringBuilder strbuilder = new StringBuilder();
		long n01=System.nanoTime();
		for(int i=0;i<str.length();i++)
			for(int j=0;j<=i;j++)
				strbuilder.append(str.charAt(j));
		
		long n02=System.nanoTime();
		System.out.println("Result ::"+newstr);
		System.out.println("Approx time taken: "+(n02-n01)+"nanosecs");
	}

}

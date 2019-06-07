package com.lti.Day_4;

public class Stringham {
     public static void main(String args[]) {
    	 String s1 = "Java";
    	 String s2 = "Java";
    	 String s3 = new String( "Java");
    	 String s4 = new String("Java");
    	 
    	 System.out.println(s1==s2);
    	 System.out.println(s3==s4);
    	 String s5 = "JAVA";
    	 String s6 = s1.toUpperCase();
    	 System.out.println(s5==s6);
    	 
    	 String s7 = "Hello";
    	 String s8 = "World";
    	 String s9 = "HelloWorld";
    	 String s10 = s7 + s8;
    	 System.out.println(s9==s10);
    	 
    	 
    	 String s11= "Hello";
    	 String s12= "World";
    	 String s13= "HelloWorld";
    	 String s14 = (s11 + s12).intern();
    	 System.out.println(s13==s14);

         String str="Sdtujbndkjfgioujerdlsn7693496784bgjuyjrtghtFHKGHG98mcdejyhioyjebvnADTUJKHDWQWSBUI875433BJIKHRWVHIOhdfjgf";
         
         String newstr = "";
         System.out.println("using concatenation");
         long ns1 =  System.nanoTime();                                       //many strings are created
         for(int i=0;i<str.length();i++)
        	   for(int j=0;j<=i;j++)
        		   newstr += str.charAt(j);
         long ns2 =  System.nanoTime();
         System.out.println("Result::"+ newstr);
         System.out.println("ApproxTime Taken:"+(ns2-ns1)+"nanosec.");
         
         
         System.out.println("using string buffer");
          StringBuffer strbuffer = new StringBuffer();
           ns1 =  System.nanoTime();
          for(int i=0;i<str.length();i++)
         	   for(int j=0;j<=i;j++)
         		   strbuffer.append( str.charAt(j));
           ns2 =  System.nanoTime();
          System.out.println("Result::"+ strbuffer);
          System.out.println("ApproxTime Taken:"+(ns2-ns1)+"nanosec.");
          
          
          System.out.println("using string builder");
          StringBuilder strbuilder = new StringBuilder();
           ns1 =  System.nanoTime();
          for(int i=0;i<str.length();i++)
         	   for(int j=0;j<=i;j++)
         		   strbuilder.append( str.charAt(j));
           ns2 =  System.nanoTime();
          System.out.println("Result::"+ strbuilder);
          System.out.println("ApproxTime Taken:"+(ns2-ns1)+"nanosec.");
          
          
          
          
         
         
         
         
     }
}


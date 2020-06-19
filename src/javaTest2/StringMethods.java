package javaTest2;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1="hello";
		String s2="Orange";
		String s3="apple";
		String s4="hello";
		String s5="Bello";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s4.compareTo(s5));
		System.out.println(s5.compareTo(s1));
		System.out.println(s2.compareTo(s1));
	
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s5));
		System.out.println(s1.equals(s4));
		//concat()
		String str="Hello";
		String str1="Java";
		String str2="Reader";
		
		String str3=str.concat(str1); 
		
		System.out.println(str3);
		String str4=str.concat(str1).concat(str2);
		System.out.println(str4);
		
		//tocharAT()
		String name="DeepakumariDave";
		
		char ch=name.charAt(6);
		
		System.out.println(ch);
		
		//toUpperCase()
		String st1="deepadave";
		
		String st1upper= st1.toUpperCase();
		
		System.out.println(st1upper);
		
		//toLowerCase()
		String st2="DEEPADAVE";
				
		String st2lower= st2.toLowerCase();
				
		System.out.println(st2lower);
				
		
		//trim()
		String string=" hello  ";
		
		System.out.println("before trim" + string);
		
		String sresult=string.trim();
		
		System.out.println("After trim" + sresult);
		
		
		//subString()
		String substr="Selenium Learning";
		
		String result=substr.substring(6);
		System.out.println(result);
		String result1=substr.substring(3);
		System.out.println(result1);
	
		
		//String result2=substr.substring(20);
		//System.out.println( result2);
		
		//endwith()
		
		String ste1="I like Tea";
		
		System.out.println( ste1.endsWith("I"));
		System.out.println( ste1.endsWith("Tea"));
		
		///length()
		
		System.out.println( ste1.length());
		
		//replace()
		
		String strp="my country name is India i was lived in gujarat ";
		
		String replaceString=strp.replace("i", "e");
		
		System.out.println(replaceString);
		
		//replaceAll()
		
		String st=" My name is Rahul. My name is Geeta. My name is Harsh";
		
		String replaceAllString=st.replaceAll("is", "was");
		
		System.out.println(replaceAllString);
		
		//replaceFirst()
		String stu="There is big Gate in Umreth";
		
		String replaceFirst=stu.replaceFirst("There", "LalDarwaja");
		
		System.out.println(replaceFirst);
		
		//split()
		
		String sp1="java have four pillars";
		
		String[] words=sp1.split("\\s"); 
		  
		for(String w:words){ 
			
		System.out.println(w);  
		}  
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
	

		
		
		
		
	
	
		

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



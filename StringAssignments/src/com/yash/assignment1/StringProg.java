package com.yash.assignment1;

public class StringProg {

	public static void main(String[] args) {
		
		String s="abc";
	    s="abcc";
		System.out.println("hashcode= "+s.hashCode()+" compare="+s.equals(s));
		
		String str=new String();
		System.out.println(str.hashCode());
		str=new String("yash");
		System.out.println(str.hashCode()+" Substring= "+str.substring(3)+" Concat= "+str.concat(s)+" "+str.replace('y', 'a'));
		str="tech";
		System.out.println("hashcode= "+str.hashCode());
		str="";
		System.out.println(str.hashCode());
		
		StringBuilder st=new StringBuilder("ab");
		String sr1="cd";
		System.out.println(st.append("cd"));
		System.out.println(st);
		
		StringBuffer sb=new StringBuffer("ab");
	
		System.out.println(sb.append("cd"));
		System.out.println(sb);
		
		String obj=new String("abc");
		String obj2=new String("abc");
		
		System.out.println(obj2.hashCode());
		System.out.println(obj.hashCode()+" Object Using equals method: "+obj.equals(obj2));
		System.out.println(obj2.hashCode()+"  "+obj==obj2);
		
	}

}

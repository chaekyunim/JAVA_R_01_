package com.biz.hello;

import com.biz.hello1.AddClass;

public class HelloEx003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AddClass aClass = new AddClass();
        PersonClass bClass = new PersonClass();
        
        aClass.add();
        bClass.add();
        
        aClass.add(10,10);
        bClass.add(10,10);
        
        int ret1 = aClass.add("A","B");
        int ret2 = bClass.add("A","B");
        System.out.println(ret1);
        System.out.println(ret2);
	}
	

}

package com.biz.hello;

import com.biz.hello1.AddClass;

public class HelloEx_002 {

	public static void main(String[] args) {
		
		AddClass addclass;
		addclass = new AddClass();
		addclass.add(1,2);
		
		String ret = AddClass.add("Korea,Republic");
				System.out.println(ret);
		
		AddClass addClass2 = new AddClass() ;
		addClass2.add();
		addClass2.add(50,60);
		

	}

}

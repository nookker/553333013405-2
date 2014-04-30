package com.lab2.arraylist;

public class TestArrayList {
		
	public static void main(String[] args) {

		System.out.println("------------------------ArrayList---------------------------");
		ArrayList li = new ArrayList();
		li.add("1");
		li.add("2");
		li.add("3");
		li.add("4");
		li.add("5");
		System.out.println(li);

		System.out.println("---------------------ArrayListQueue-------------------------");
		ArrayListQueue qu = new ArrayListQueue();
		qu.enQueue("1");
		qu.enQueue("2");
		qu.enQueue("3");
		qu.enQueue("4");
		qu.enQueue("5");
		System.out.println(qu);

		System.out.println("---------------------ArrayListStack-------------------------");
		ArrayListStack st = new ArrayListStack();
		st.push("1");
		st.push("2");
		st.push("3");
		st.push("4");
		st.push("5");
		System.out.println(st);



	}
}



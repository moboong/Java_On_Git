package kr.ac.kopo.day14;

import java.util.ArrayList;
import java.util.Random;

class A {
	private Object obj;
	
	public A(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	public void info() {
		System.out.println("obj : " + obj.toString());
	}
	
}

class B<T> {
	private T obj;
	
	public B(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	public void info() {
		System.out.println("obj : " + obj);
	}
	
}

public class GenericMain {

	public static void main(String[] args) {
		A a01 = new A(new String("hello"));
		A a02 = new A(new Random());
		
		a01.info();
		a02.info();
		
		
		System.out.println( ((String)a01.getObj()).length()); // a01.getObj().toString().length(); 이것도 가능 어쨌든 명시적 형변환을 해줘야함.
		//렝스를 사용하려면 스트링형이어야하니까. 사실상 string이지만 반환형이 오브젝트라서.
		
		System.out.println(((Random)a02.getObj()).nextInt(10));
		
		B<String> b01 = new B<String>(new String("hello"));
		B<Random> b02 = new B<Random>(new Random());
		
		b01.info();
		b02.info(); 
		
		// 알아서 형변환 해준거야..!
		System.out.println(b01.getObj().length());
		System.out.println(b02.getObj().nextInt(10));
		
		
		//System.out.println(((String)b01.getObj()).length());
		//System.out.println(((Random)b02.getObj()).nextInt(10));
		
		
		// 여튼 이 모든 것은 다른 객체형을 받는 것의 폐해와 문제점을 알려주기 위한 코드야.
		
		ArrayList<String> list = new ArrayList<String>();
		//ArrayList<int> list = new ArrayList<int>(); 말했지 이건 안돼. 왜? 내부적으로 오브젝트 배열을 가지고 구성되어있어서. 참조자료형만 받을 수 있어.
		//오브젝트를 상속받은 녀석들 즉, 모든 참조자료형만 가능.
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		//이러면 정수를 받을 수 있어...!!!
	
		list.add(0, "A");
		list.add(1, "B");
		list.add(2, "C");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.size());
		
		list.remove(1);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		//System.out.println(list.get(2)); //에러남.
		
		numlist.add(1);
		System.out.println(numlist.get(0));
	}

}

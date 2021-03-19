package kr.ac.kopo.day10.homework;

public class Icecream {
	private String name;
	private int price;
	
	//총 아이스크림 개수는 static
	public static int totalIce;
	
	public Icecream(){
		totalIce++;
	}
	public Icecream(String name, int price){
		this.name = name;
		this.price = price;
		totalIce++;
	}
	
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static int getTotalIce() {
		return Icecream.totalIce;
	}
	
	
}

package kr.ac.kopo.day07.homework;

public class Icecream {
	String name;
	int price;

	Icecream() {
		this("Unkown", -1);
	}

	Icecream(String name) {
		this(name, -1);
	}

	Icecream(int price) {
		this("Unkown", price);
	}

	Icecream(String name, int price) {
		this.name = name;
		this.price = price;
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	void setName(String name) {
		this.name = name;
	}

	void setPrice(int price) {
		this.price = price;
	}
}

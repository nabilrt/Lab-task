package Setget;
public class Employee {
	int i;
	int j;
	int z;
	void setmilk(int i) {
		this.i=i;
		
	}
	int getmilk (){
		return this.i;
	}
	void setblue(int j) {
		this.j=j;
	}
	int getblue() {
		return this.j;
	}
	void setwhite(int z) {
		this.z=z;
	}
	int getwhite() {
		return this.z;
	}
	void show() {
		System.out.println(""+getblue());
		System.out.println(""+getwhite());
		System.out.println(""+getmilk());
	}
}


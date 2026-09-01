package practice;

class A{
	static int x;
}
public class B {

	public static void main(String[] args) {

		A a1 = new A();
		a1.x=10;
		A a2 = new A();
		System.out.println(a2.x);
	}

}

package this_super_keyword;

public class This_key {
	int a =10; // Global variable
	public void test() {
		int b = 20; // Local variable
		System.out.println(b);
		System.out.println(this.a);
	}
}

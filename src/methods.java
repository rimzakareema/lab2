public class methods {
	
	public int sum(int a, int b) {
		int c = a+b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methods m = new methods();//creating an object
		int result = m.sum(2,3);//calling method using object
		System.out.println("Result of sum is: "+result);
	}

}

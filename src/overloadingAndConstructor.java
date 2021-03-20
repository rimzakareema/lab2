
public class overloadingAndConstructor implements MyInterface {
	
	int e = 100, f =200;
	overloadingAndConstructor(int e, int f){
		this.e = e;//this is used to ignore global value e=100
		this.f = f;//this is used to ignore global value f=	100
	}
	public int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	//overloaded method is below
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadingAndConstructor obj = new overloadingAndConstructor(5,6);
		int result = obj.sum(3, 7);
		int result1 = obj.sum(9,7,6);
		System.out.println("Result for normal method: "+result);
		System.out.println("Result for overloaded method: "+result1);
	}
}

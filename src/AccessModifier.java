package pack2;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside AccessModifier");
		specificModifier obj = new specificModifier();
		obj.display();// can be used here as display is protected below in specificModifier
		//private won't work
	}

}

class specificModifier{
	protected void display() {
		System.out.println("Inside specificModifier");
	}
}
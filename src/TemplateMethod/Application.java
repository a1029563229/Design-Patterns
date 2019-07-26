package TemplateMethod;

public class Application extends Library {

	@Override
	protected void Step2() {
		// TODO Auto-generated method stub
		System.out.println("Application Step2");
	}

	@Override
	protected void Step5() {
		// TODO Auto-generated method stub
		System.out.println("Application Step5");
	}
	
	public static void main(String[] args) {
		Application app = new Application();
		app.Run();
	}
}

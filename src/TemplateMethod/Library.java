package TemplateMethod;

public abstract class Library {
	protected void Step1() {
		System.out.println("Step1");
	}
	
	protected void Step3() {
		System.out.println("Step3");
	}
	
	protected void Step4() {
		System.out.println("Step4");
	}
	
	protected abstract void Step2();
	protected abstract void Step5();
	
	public void Run() {
		this.Step1();
		this.Step2();
		this.Step3();
		this.Step4();
		this.Step5();
	}
}

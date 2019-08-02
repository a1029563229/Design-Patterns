package FatoryMethod;

public class MainForm {
	public SplitterFactory factory;
	
	public MainForm(SplitterFactory factory) {
		this.factory = factory;
	}
	
	public void click() {
		ISplitter splitter = this.factory.createSplitter();
		splitter.split();
	}
	
	public static void main(String[] args) {
		MainForm main1 = new MainForm(new BinarySplitterFactory());
		main1.click();
		MainForm main2 = new MainForm(new TxtSplitterFactory());
		main2.click();
	}
}

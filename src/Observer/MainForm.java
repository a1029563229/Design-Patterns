package Observer;

abstract class IProgress {
	public abstract void onProgress(int val);
}

class IProgressBar extends IProgress{
	public void onProgress(int val) {
		System.out.println(val + "%");
	}
}

class IProgressText extends IProgress{
	public void onProgress(int val) {
		System.out.println("...");
	}
}

public class MainForm {
	public static void main(String[] args) {
		FileSplitter splitter = new FileSplitter();
		splitter.addProgress(new IProgressBar());
		splitter.addProgress(new IProgressText());
		splitter.split();
	}
}

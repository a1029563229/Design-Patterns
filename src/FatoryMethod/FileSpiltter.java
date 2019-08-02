package FatoryMethod;

class BinarySplitter extends ISplitter {
	protected void split() {
		System.out.println("BinarySplitter split");
	}
}

class TxtSplitter extends ISplitter {
	protected void split() {
		System.out.println("TxtSplitter split");
	}
}

class BinarySplitterFactory extends SplitterFactory {
	public ISplitter createSplitter() {
		return new BinarySplitter();
	}
}

class TxtSplitterFactory extends SplitterFactory {
	public ISplitter createSplitter() {
		return new TxtSplitter();
	}
}

public class FileSpiltter {

}

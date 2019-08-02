package FatoryMethod;

abstract class ISplitter {
	protected abstract void split();
}

abstract class SplitterFactory {
	protected abstract ISplitter createSplitter();
}

public class ISplitterFactory {

}

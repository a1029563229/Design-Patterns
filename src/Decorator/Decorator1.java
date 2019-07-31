package Decorator;

abstract class Stream {
	protected abstract char Read();
	protected abstract void Seek();
	protected abstract void Write();
}

class FileStream extends Stream {
	protected char Read() {
		System.out.println("FileStream Read");
		return 0;
	}

	protected void Seek() {
		System.out.println("FileStream Seek");
	}

	protected void Write() {
		System.out.println("FileStream Write");
	}
}

class NetworkStream extends Stream {
	protected char Read() {
		System.out.println("NetWorkStream Read");
		return 0;
	}

	protected void Seek() {
		System.out.println("NetWorkStream Seek");
	}

	protected void Write() {
		System.out.println("NetWorkStream Write");
	}
}

class MemoryStream extends Stream {
	protected char Read() {
		System.out.println("MemoryStream Read");
		return 0;
	}

	protected void Seek() {
		System.out.println("MemoryStream Seek");
	}

	protected void Write() {
		System.out.println("MemoryStream Write");
	}
}

// 扩展操作 扩展一个种类的子类需要增加 n个基类数量的子类
class CryptoFileStream extends FileStream {
	public char Read() {
		System.out.println("Extra1 CryptoFileStream Read");
		super.Read();
		System.out.println("Extra2 CryptoFileStream Read");
		return 0;
	}
}

class CryptoNetworkStream extends NetworkStream {
	public char Read() {
		System.out.println("Extra1 CryptoNetworkStream Read");
		super.Read();
		System.out.println("Extra2 CryptoNetworkStream Read");
		return 0;
	}
}

class CryptoMemoryStream extends MemoryStream {
	public char Read() {
		System.out.println("Extra1 CryptoMemoryStream Read");
		super.Read();
		System.out.println("Extra2 CryptoMemoryStream Read");
		return 0;
	}
}

class BufferFileStream extends FileStream {
	//...
}

class BufferNetworkStream extends NetworkStream {
	//...
}

class BufferMemoryStream extends MemoryStream {
	//...
}

public class Decorator1 {
	public static void main(String[] args) {
		Stream cryproFileStream = new CryptoFileStream();
		cryproFileStream.Read();
		Stream networkFileStream = new CryptoNetworkStream();
		networkFileStream.Read();
		Stream memoryFileStream = new CryptoMemoryStream();
		memoryFileStream.Read();
	}
}

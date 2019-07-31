package Decorator;

abstract class DecoratorStream extends Stream {
	protected Stream stream;
	
	public DecoratorStream(Stream stream) {
		this.stream = stream;
	}
}

class CryptoStream extends DecoratorStream {
	public CryptoStream(Stream stream) {
		super(stream);
	}

	public char Read() {
		System.out.println("CryptoStream Read1");
		this.stream.Read();
		System.out.println("CryptoStream Read2");
		return 0;
	}

	public void Seek() {
		System.out.println("CryptoStream Seek1");
		this.stream.Seek();
		System.out.println("CryptoStream Seek2");
	}

	protected void Write() {
		System.out.println("CryptoStream Write1");
		this.stream.Write();
		System.out.println("CryptoStream Write2");
	}
}

public class Decorator2 {
	public static void main(String[] args) {
		Stream s1 = new FileStream();
		Stream s2 = new NetworkStream();
		Stream cryptoFile = new CryptoStream(s1);
		Stream cryptoNetwork = new CryptoStream(s2);
		cryptoFile.Read();
		cryptoNetwork.Read();
	}
}

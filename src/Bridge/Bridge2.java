package Bridge;

abstract class Messager2 {
	protected MessagerImp2 messagerImp;
	
	protected abstract void Login();
	protected abstract void SendMessage();
	protected abstract void SendPicture();
}

abstract class MessagerImp2 {
	protected abstract void PlaySound();
	protected abstract void DrawShape();
	protected abstract void WriteText();
	protected abstract void Connect();
}

class PCMessageBase2 extends MessagerImp2 {
	public void PlaySound() {
		System.out.println("PCMessageBase PlaySound");
	}

	public void DrawShape() {
		System.out.println("PCMessageBase DrawShape");
	}

	public void WriteText() {
		System.out.println("PCMessageBase WriteText");
	}

	public void Connect() {
		System.out.println("PCMessageBase Connect");
	}
}

class MobileMessagerBase2 extends MessagerImp2 {
	public void PlaySound() {
		System.out.println("MobileMessageBase PlaySound");
	}

	public void DrawShape() {
		System.out.println("MobileMessageBase DrawShape");
	}

	public void WriteText() {
		System.out.println("MobileMessageBase WriteText");
	}

	public void Connect() {
		System.out.println("MobileMessageBase Connect");
	}
}

class MessagerLite2 extends Messager2 {
	public MessagerLite2(MessagerImp2 messagerImp) {
		this.messagerImp = messagerImp;
	}

	public void Login() {
		this.messagerImp.Connect();
		System.out.println("Lite Login");
	};
	
	public void SendMessage() {
		this.messagerImp.WriteText();
		System.out.println("Lite SendMessage");
	};
	
	public void SendPicture() {
		this.messagerImp.DrawShape();
		System.out.println("Lite SendPicture");
	};
}

class MessagerPerfect2 extends Messager2 {
	public MessagerPerfect2(MessagerImp2 messagerImp) {
		this.messagerImp = messagerImp;
	}
	
	public void Login() {
		this.messagerImp.PlaySound();
		System.out.println("Perfect Login1");
		this.messagerImp.Connect();
		System.out.println("Perfect Login2");
	};
	
	public void SendMessage() {
		this.messagerImp.PlaySound();
		System.out.println("Perfect SendMessage1");
		this.messagerImp.WriteText();
		System.out.println("Perfect SendMessage2");
	};
	
	public void SendPicture() {
		this.messagerImp.PlaySound();
		System.out.println("Perfect SendPicture1");
		this.messagerImp.DrawShape();
		System.out.println("Perfect SendPicture2");
	};
}

//假设增加了一个 xbox 的平台，则需要新增 XBOXMessagerBase 一个子类
public class Bridge2 {
	public static void main(String[] args) {
		// 运行时装载
		MessagerImp2 pcImp = new PCMessageBase2();
		Messager2 pc = new MessagerLite2(pcImp);
		pc.Login();
		MessagerImp2 mobileImp = new MobileMessagerBase2();
		Messager2 mobile = new MessagerPerfect2(mobileImp);
		mobile.Login();
	}
}

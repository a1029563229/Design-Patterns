package Bridge;

abstract class Messager {
	protected void Login() {};
	protected void SendMessage() {};
	protected void SendPicture() {};
	
	protected void PlaySound() {};
	protected void DrawShape() {};
	protected void WriteText() {};
	protected void Connect() {};
}

class PCMessageBase extends Messager {
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

class MobileMessageBase extends Messager {
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

class PCMessagerLite extends PCMessageBase {
	public void Login() {
		super.Connect();
		System.out.println("Lite Login");
	};
	
	public void SendMessage() {
		super.WriteText();
		System.out.println("Lite SendMessage");
	};
	
	public void SendPicture() {
		super.DrawShape();
		System.out.println("Lite SendPicture");
	};
}

class PCMessagerPerfect extends PCMessageBase {
	public void Login() {
		super.PlaySound();
		System.out.println("Perfect Login1");
		super.Connect();
		System.out.println("Perfect Login2");
	};
	
	public void SendMessage() {
		super.PlaySound();
		System.out.println("Perfect SendMessage1");
		super.WriteText();
		System.out.println("Perfect SendMessage2");
	};
	
	public void SendPicture() {
		super.PlaySound();
		System.out.println("Perfect SendPicture1");
		super.DrawShape();
		System.out.println("Perfect SendPicture2");
	};
}

class MobileMessagerLite extends MobileMessageBase {
	public void Login() {
		super.Connect();
		System.out.println("Lite Login");
	};
	
	public void SendMessage() {
		super.WriteText();
		System.out.println("Lite SendMessage");
	};
	
	public void SendPicture() {
		super.DrawShape();
		System.out.println("Lite SendPicture");
	};
}

class MobileMessagerPerfect extends MobileMessageBase {
	public void Login() {
		super.PlaySound();
		System.out.println("Perfect Login1");
		super.Connect();
		System.out.println("Perfect Login2");
	};
	
	public void SendMessage() {
		super.PlaySound();
		System.out.println("Perfect SendMessage1");
		super.WriteText();
		System.out.println("Perfect SendMessage2");
	};
	
	public void SendPicture() {
		super.PlaySound();
		System.out.println("Perfect SendPicture1");
		super.DrawShape();
		System.out.println("Perfect SendPicture2");
	};
}

// 假设增加了一个 xbox 的平台，则需要新增 XBOXMessagerBase、XBOXMessagerLite、XBOXMessagerPerfect 三个子类
public class Bridge1 {
	public static void main(String[] args) {
		// 编译时装载
		Messager pc = new PCMessagerLite();
		pc.Login();
		Messager mobile = new MobileMessagerPerfect();
		mobile.Login();
	}
}

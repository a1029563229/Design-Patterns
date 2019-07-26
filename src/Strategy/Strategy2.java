package Strategy;

// 新增一个语言种类 修改代码：0处 新增代码：1处

abstract class TaxStrategy {
	protected abstract void CalculateTax();
}

class CNTax extends TaxStrategy {
	protected void CalculateTax() {
		System.out.println("CN");
	}
}

class USTax extends TaxStrategy {
	protected void CalculateTax() {
		System.out.println("US");
	}
}

class DETax extends TaxStrategy {
	protected void CalculateTax() {
		System.out.println("DE");
	}
}

class FRTax extends TaxStrategy {
	protected void CalculateTax() {
		System.out.println("FR");
	}
}

// 新增一个语言种类（修改代码）
class DBTax extends TaxStrategy {
	protected void CalculateTax() {
		System.out.println("DB");
	}
}

public class Strategy2 {
	public TaxStrategy tax;
	
	public Strategy2(TaxStrategy tax) {
		this.tax = tax;
	}
	
	public static void main(String[] args) {
		Strategy2 strategy = new Strategy2(new DBTax());
		strategy.tax.CalculateTax();
	}
}

package Strategy;

//新增一个语言种类 修改代码：2处 新增代码：0处
enum TaxBase {
	CN_Tax,
	US_Tax,
	DE_Tax,
	FR_Tax,
	// 新增一个语言种类（修改代码）
	DB_Tax
}

public class Strategy1 {
	public TaxBase tax;
	
	public Strategy1(TaxBase tax) {
		this.tax = tax;
	}
	
	public static void main(String[] args) {
		Strategy1 strategy = new Strategy1(TaxBase.DB_Tax);		
		strategy.CalculateTax();
	}
	
	public void CalculateTax() {
		if (this.tax == TaxBase.CN_Tax) {
			System.out.println("CN");
		} else if (this.tax == TaxBase.US_Tax) {
			System.out.println("US");
		} else if (this.tax == TaxBase.DE_Tax) {
			System.out.println("DE");
		} else if (this.tax == TaxBase.FR_Tax) {
			System.out.println("FR");
			// 新增一个语言种类（修改代码）
		} else if (this.tax == TaxBase.DB_Tax) {
			System.out.println("DB");
		} else {
			System.out.println("UNKNOWN");
		}
	}
}

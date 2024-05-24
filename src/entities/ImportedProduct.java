package entities;

public class ImportedProduct extends Product{
	private Double customsFee;
	public ImportedProduct() {
		
	}
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	public Double getCustomsFee() {
		return customsFee;
	}
	
	@Override
	public final String priceTag() {
		;
		return name+ " $ " + (price + customsFee) + " (Customs fee: $ " + customsFee + ")"; 
		
	}
}

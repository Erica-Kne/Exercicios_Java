package entities;

public class ImportedProduct extends Product {

    private double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public void totalPrice() {
        setPrice(getPrice() + customsFee);
    }

    public double getCustomsFee() {
        return customsFee;
    }

    @Override
    public String priceTag() {
        return String.format("%s $ %.2f  (CustomsFee: $ %.2f)", getName(), getPrice(), customsFee);
    }

}

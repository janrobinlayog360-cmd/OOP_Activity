package ElectronicsProduct;

public class ElectronicsMain {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("WM101", "LG TurboWash", 25000, 2);

        wm.showDetails();
        wm.applyDiscount(10); // apply 10% discount
        wm.extendWarranty(1); // extend warranty by 1 year
        wm.showDetails(); // show updated details
    }
}
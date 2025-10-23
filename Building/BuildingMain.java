package Building;

public class BuildingMain {
    public static void main(String[] args) {
        ResidentialBuilding rb = new ResidentialBuilding("123 Maple St", 5, 1500, 10, 12000);
        CommercialBuilding cb = new CommercialBuilding("45 Business Ave", 8, 5000, 4000, 250);

        System.out.println("=== Residential Building ===");
        rb.showDetails();

        System.out.println("\n=== Commercial Building ===");
        cb.showDetails();
    }
}


package GymMembership;

public class GymMain {
    public static void main(String[] args) {
        GymMembership basicMember = new GymMembership("Alice Cruz", "Basic", 6);
        PremiumMembership premiumMember = new PremiumMembership("Mark Reyes", 12, true, true);

        System.out.println("=== Basic Membership ===");
        basicMember.displayDetails();
        basicMember.checkSpecialOffer();

        System.out.println("\n=== Premium Membership ===");
        premiumMember.displayDetails();
        premiumMember.checkSpecialOffer();
    }
}

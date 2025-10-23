package GymMembership;

public class PremiumMembership extends GymMembership {
    boolean hasPersonalTrainer;
    boolean hasSpaAccess;

    PremiumMembership(String memberName, int duration, boolean hasPersonalTrainer, boolean hasSpaAccess) {
        super(memberName, "Premium", duration);
        this.hasPersonalTrainer = hasPersonalTrainer;
        this.hasSpaAccess = hasSpaAccess;
    }

    @Override
    double calculateFee() {
        double baseRate = 2000; // per month
        double extra = 0;

        if (hasPersonalTrainer) extra += 500;
        if (hasSpaAccess) extra += 300;

        return (baseRate + extra) * duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Personal Trainer: " + (hasPersonalTrainer ? "Yes" : "No"));
        System.out.println("Spa Access: " + (hasSpaAccess ? "Yes" : "No"));
    }
}

public class GymMembership {
    String memberName;
    String membershipType;
    int duration; // in months

    GymMembership(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    double calculateFee() {
        double monthlyRate;
        if (membershipType.equalsIgnoreCase("Basic")) {
            monthlyRate = 800;
        } else if (membershipType.equalsIgnoreCase("Standard")) {
            monthlyRate = 1200;
        } else {
            monthlyRate = 0;
        }
        return monthlyRate * duration;
    }

    void checkSpecialOffer() {
        if (duration >= 12) {
            System.out.println("🎉 Special Offer: 1 month free extension!");
        } else {
            System.out.println("No special offers available.");
        }
    }

    void displayDetails() {
        System.out.println("\nMember Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Total Fee: ₱" + calculateFee());
    }
}

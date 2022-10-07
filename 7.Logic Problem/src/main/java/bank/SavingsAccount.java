package bank;

public class SavingsAccount extends Account {

    private double interest;

    @Override
    public void withDraw() {

    }

    @Override
    public void deposit() {

    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}

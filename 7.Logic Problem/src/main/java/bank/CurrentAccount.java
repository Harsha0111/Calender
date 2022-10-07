package bank;

public class CurrentAccount extends Account {

    private double overDraft;

    @Override
    public void withDraw() {

    }

    @Override
    public void deposit() {

    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }
}

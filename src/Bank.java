public class Bank {
    private double homeloan;
    private double deposit;
    private double withdrawl;

    public Bank(double homeloan, double deposit, double withdrawl, String passbook) {
        this.homeloan = homeloan;
        this.deposit = deposit;
        this.withdrawl = withdrawl;
        this.passbook = passbook;
    }

    public double getHomeloan() {
        return homeloan;
    }

    public void setHomeloan(double homeloan) {
        this.homeloan = homeloan;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdrawl() {
        return withdrawl;
    }

    public void setWithdrawl(double withdrawl) {
        this.withdrawl = withdrawl;
    }

    public String getPassbook() {
        return passbook;
    }

    public void setPassbook(String passbook) {
        this.passbook = passbook;
    }

    private String passbook;
    {

    }
}

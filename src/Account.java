public class Account
{
    private long account;
    private String name,email;
    private  float amount;

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public double getContact() {
        return contact;
    }

    public void setContact(double contact) {
        this.contact = contact;
    }

    public Account(long account, String name, String email, float amount, double contact) {
        this.account = account;
        this.name = name;
        this.email = email;
        this.amount = amount;
        this.contact = contact;
    }
    public void display()
    {
        System.out.println(name);
    }

    private  double contact;
}

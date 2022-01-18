package Bank;

public class User {
    private String phoneNumber;
    private long accountBalance;
    private String password;

    public User(String phoneNumber, long accountBalance, String password) {
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return
                "Số điện thoại= " + phoneNumber +
                " - accountBalance= " + accountBalance +
                " - password= " + password
                ;
    }
}

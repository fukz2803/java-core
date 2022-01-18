package Bank;

import java.time.LocalDate;
import java.util.Date;

public class History {
    private int idTranfer;
    private LocalDate date;
    private String description;
    private String accountNumber;
    private long amount;

    public History(int idTranfer, LocalDate date, String description, String accountNumber, long amount) {
        this.idTranfer = idTranfer;
        this.date = date;
        this.description = description;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public int getIdTranfer() {
        return idTranfer;
    }

    public void setIdTranfer(int idTranfer) {
        this.idTranfer = idTranfer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return  idTranfer + " - " +
                date + " - " +
                description  + " - " +
                accountNumber  + " - " +
                amount
                ;
    }
}

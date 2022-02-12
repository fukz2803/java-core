package Model;

import Util.Util;

public class Cart extends Product {
    private String idCart;
    private String idAccount;

    public Cart(String idAccount, int id, String name, String description, long price, int amount, int amountSale, String brand, Category category) {
        super(id, name, description, price, amount, amountSale, brand, category);
        this.idCart = Util.randomId(5);
        this.idAccount = idAccount;
    }

    public String getIdCart() {
        return idCart;
    }

    public void setIdCart(String idCart) {
        this.idCart = idCart;
    }

    public String getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    @Override
    public String toString() {
        return  super.toString();
    }
}

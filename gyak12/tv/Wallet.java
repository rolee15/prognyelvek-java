package tv;

public class Wallet {

    private int balance;

    public void draw(int amount) throws InsufficientFundsException {
        if (amount <= 0) throw new IllegalArgumentException("amount must be greater than zero");
        if (amount > balance) throw new InsufficientFundsException("Insufficient funds to draw amount");

        balance -= amount;
    }

    public void topUp(String cardNumber, int amount) throws CreditCardException {
        if (amount <= 0) throw new IllegalArgumentException("amount must be greater than zero");

        try (var creditCard = new CreditCard(cardNumber)) {
            creditCard.charge(amount);
        }
    }
}
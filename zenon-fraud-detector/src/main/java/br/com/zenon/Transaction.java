
package br.com.zenon;

import java.math.BigDecimal;

public class Transaction {

    private final int step;
    private final TransactionType type;
    private final BigDecimal amount;

    private final TransactionCustomer origin;
    private final TransactionCustomer recipient;

    private final boolean isFraud;
    private final boolean isFlaggedFraud;

    public Transaction(
            int step,
            TransactionType type,
            BigDecimal amount,
            TransactionCustomer origin,
            TransactionCustomer recipient,
            boolean isFraud,
            boolean isFlaggedFraud
    ) {
        this.step = step;
        this.type = type;
        this.amount = amount;
        this.origin = origin;
        this.recipient = recipient;
        this.isFraud = isFraud;
        this.isFlaggedFraud = isFlaggedFraud;
    }

    public int getStep() {
        return step;
    }

    public TransactionType getType() {
        return type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public TransactionCustomer getOrigin() {
        return origin;
    }

    public TransactionCustomer getRecipient() {
        return recipient;
    }

    public boolean isFraud() {
        return isFraud;
    }

    public boolean isFlaggedFraud() {
        return isFlaggedFraud;
    }
}


package br.com.zenon;

import java.math.BigDecimal;

public class TransactionCustomer {

    private final String name;
    private final BigDecimal oldBalance;
    private final BigDecimal newBalance;

    public TransactionCustomer(
            String name,
            BigDecimal oldBalance,
            BigDecimal newBalance
    ) {
        this.name = name;
        this.oldBalance = oldBalance;
        this.newBalance = newBalance;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getOldBalance() {
        return oldBalance;
    }

    public BigDecimal getNewBalance() {
        return newBalance;
    }
}

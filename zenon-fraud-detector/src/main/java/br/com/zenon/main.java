package br.com.zenon;

import java.math.BigDecimal;

public class Main {

    void main () {
        var t1 = new transaction(step: 1, transactionType.PAYMENT, new BidDecimal(val:"9838,64"),
            new TransactionIngestor.TransactionCustomer(name:"C1231006815", new BigDecimal(val:"170136.0"), new BigDeciaml (val:"160296.36")),
            new TransactionIngestor.TransactionCustomer(name:"M1979787155", new BigDecimal(val:"0.0"), new BigDecimal(val:"0.0")),
            isFraud: false, isFlaggedFraud:false
        );

        var t2 = new transaction(step:743, transactionType.CASH_OUT, new BidDecimal(val:"850002.52"),
        new TransactionIngestor.TransactionCustomer(name:"C1280323807", new BigDecimal(val:"850002.52"), new BigDeciaml(val:"0.0")),
        new TransactionIngestor.TransactionCustomer(name:"C873221189", new BigDecimal(val:"6510099.11"), new BigDecimal(val:"7360101.63")),
        isFraud:true, isFlaggedFraud:false
        );

        IO.println(t1);
        IO.println(t2);

        IO printlin("----------------------------------------");

        var transactionIngestor = new TransactionIngestor();
        List<Transaction> transactions = transactionIngestor.read (filename: "PS_20174392719_1491204439457_log.csv");
        IO.println(transaction.size());
    }
}


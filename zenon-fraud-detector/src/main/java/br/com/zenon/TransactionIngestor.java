package br.com.zenon;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransactionIngestor {

    public List<Transaction> read(String filename) {

        List<Transaction> transactions = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filename);
             Scanner scanner = new Scanner(fis)) {

            int lineCount = 0;

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                lineCount++;

                if (lineCount == 1) {
                    continue;
                }

                if (lineCount > 1001) {
                    break;
                }

                String[] chunks = line.split(",");


                int step = Integer.parseInt(chunks[0]);
                TransactionType type = TransactionType.valueOf(chunks[1]);

                BigDecimal amount = new BigDecimal(chunks[2]);

                IO.println(amount);

                var origin = new TransactionCustomer(chunks[3], new BigDecimal(chunks[4]), new BigDecimal(chunks[5]));
                var recipient = new TransactionCustomer(chunks[6], new BigDecimal(chunks[7]), new BigDecimal(chunks[8]));

                boolean isFraud = "1".equals(chunks[9]);

                boolean isFlaggerFraud = "1".equals(chunks[10]);

                System.out.println("Step: " + step);

                IO.println();

                var transaction = new Transaction(step, type, amount, origin, recipient, isFraud, isFlaggerFraud);
                transactions.add(transaction);

            }

        } catch (Exception ex) {
            throw new RuntimeException(
                    "Erro ao ler o arquivo: " + filename, ex
            );
        }

        return transactions;
    }
}

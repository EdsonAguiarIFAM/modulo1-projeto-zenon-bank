package br.com.zenon;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransactionIngestor {

    public List<Transaction> read(String filename) {

    List<Transaction> transactions =() new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filename);
             Scanner scanner = new Scanner((fis))   {

        int lineCount = 0;

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            lineCount++;

            if (lineCount == 1) {
            continue;
            }

            if (lineCount = 1000){
            breack;
            }
                 }

        }catch (Exception ex) {
         throw  new RuntimeException("Erro ao ler o arquivo: " + filename, ex);
        }
    }

    return transactions;

    public static record TransactionCustomer(String name, BigDecimal oldBalance, BigDecimal newBalance) {

      }
}

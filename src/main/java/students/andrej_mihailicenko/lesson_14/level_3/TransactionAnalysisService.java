package students.andrej_mihailicenko.lesson_14.level_3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public List findTransactionsByYear(List<Transaction> transactions, int year) {
        List<Transaction> transactionAnalise = transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(Collectors.toList());
        return transactionAnalise;
    }

    public List sortTransactionsByValueFromMinToMax(List<Transaction> transactions) {
        List<Transaction> transactionFromMinToMax = transactions.stream()
                .sorted(Comparator.comparingInt(t -> t.getValue())) //тоже самое, что .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
        return transactionFromMinToMax;
    }

    public List sortTransactionsByValueFromMaxToMin(List<Transaction> transactions) {
        List<Transaction> transactionFromMinToMax = transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());
        return transactionFromMinToMax;
    }

    public List sortTransactionsByYearAndByValueFromMaxToMin(List<Transaction> transactions, int year) {
        List<Transaction> transactionFromMinToMaxAndByYear = transactions.stream()
                .filter(t -> t.getYear() == year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
        return transactionFromMinToMaxAndByYear;
    }


}
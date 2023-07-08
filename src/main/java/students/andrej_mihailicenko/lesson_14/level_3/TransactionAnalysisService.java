package students.andrej_mihailicenko.lesson_14.level_3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class TransactionAnalysisService {

    public List findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(toList());
    }

    public List sortTransactionsByValueFromMinToMax(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(t -> t.getValue())) //тоже самое, что .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(toList());
    }

    public List sortTransactionsByValueFromMaxToMin(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(toList());
    }

    public List sortTransactionsByYearAndByValueFromMaxToMin(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(toList());
    }

    public List sortTransactionsNonUniqueYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .sorted()
                .collect(toList());
    }

    public List sortTransactionsUniqueYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct()
                .sorted()
                .collect(toList());
    }


    public List sortTradersByName(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(toList());
    }

    public List sortTradersByCity(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .sorted()
                .collect(toList());
    }

    public List<Trader> findTraderByCity(List<Transaction> transactions, String City) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(City))
                .distinct()
                .collect(toList());
    }

    public boolean ifTraderEmployedInCity(List<Transaction> transactions, String City) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(City));
    }

}
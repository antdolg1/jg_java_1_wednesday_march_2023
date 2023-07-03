package students.jegors_rutkovskis.lesson_14.level_3_4_5_6;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public List<Transaction> getTransactionsFor2011Year(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .toList();
    }
    public List<Transaction> getTransactionByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .toList();
    }
    public List<Transaction> getTransactionsSortedInAscendingOrderByValue (List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .toList();
    }
    public List<Transaction> get2011YearTransactionsSortedInAscendingOrderByValue (List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .toList();
    }
    public List<Integer> getAllTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .sorted()
                .toList();
    }
    public List<Integer> getUniqueTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct() // этот метод сохраняет уникальные значения
                .sorted()
                .toList();
    }
    public List<String> getUniqueTransactionTraderNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .toList();
    }
    public List<String> getUniqueTransactionTraderCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct() // уникальные значения
                .sorted()
                .toList();
    }
    public List<String> getTransactionTraderUniqueNamesFromCambridge(List<Transaction> t) {
        return t.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase("cambridge"))
                .map(Trader::getName)
                .distinct()
                .sorted()
                .toList();
    }
    public List<String> getTransactionTraderUniqueNamesFromCity(List<Transaction> transactions,
                                                                String fromCity) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase(fromCity))
                .map(Trader::getName)
                .distinct()
                .sorted()
                .toList();
    }
    public boolean hasTraderInMilan(List<Transaction> transactions) {
        return transactions.stream()
                .anyMatch(t -> t.getTrader().getCity()
                        .equalsIgnoreCase("milan"));
    }
    public boolean hasTraderInCity(List<Transaction> transactions, String cityToCheck) {
        return transactions.stream()
                .anyMatch(t -> t.getTrader().getCity()
                        .equalsIgnoreCase(cityToCheck));
    }
    public Optional<Integer> getMaxTransactionValue(List<Transaction> transactions) {
        return transactions.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue);

    }
    public Optional<Integer> getMinTransactionValue(List<Transaction> transactions) {
        return transactions.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue);
    }
    public String getSortedUniqueTraderNamesAsString(List<Transaction> transactions) {
        return transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
    }
    public String getSortedUniqueTraderCitiesAsString(List<Transaction> transactions) {
        return transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
    }
}

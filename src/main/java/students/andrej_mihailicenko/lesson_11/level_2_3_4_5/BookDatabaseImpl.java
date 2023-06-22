package students.andrej_mihailicenko.lesson_11.level_2_3_4_5;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {
    private long id = 0;
    private ArrayList<Book> bookList = new ArrayList<>();

    @Override
    public Long save(Book book) {
        book.setId(id);
        bookList.add(book);
        id++;
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        return bookList.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> resultAuthor = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                resultAuthor.add(book);
            }
        }
        return resultAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> resultTitle = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                resultTitle.add(book);
            }
        }
        return resultTitle;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> booksToRemove = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                booksToRemove.add(book);
            }
        }
        bookList.removeAll(booksToRemove);
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> booksToRemove = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                booksToRemove.add(book);
            }
        }
        bookList.removeAll(booksToRemove);
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (searchCriteria.match(book)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthors = new HashSet<>();
        for (Book book : bookList) {
            uniqueAuthors.add(book.getAuthor());
        }
        return uniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitle = new HashSet<>();
        for (Book book : bookList) {
            uniqueTitle.add(book.getTitle());
        }
        return uniqueTitle;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uniqueBook = new HashSet<>(bookList);
        return uniqueBook;
    }

    @Override
    public boolean contains(Book book) {
        return bookList.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorToBooksMap = new HashMap<>();

        for (Book book : bookList) {
            String author = book.getAuthor();
            List<Book> booksByAuthor = authorToBooksMap.getOrDefault(author, new ArrayList<>());
            booksByAuthor.add(book);
            authorToBooksMap.put(author, booksByAuthor);
        }

        return authorToBooksMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> authorBookCountMap = new HashMap<>();

        for (Book book : bookList) {
            String author = book.getAuthor();
            authorBookCountMap.put(author, authorBookCountMap.getOrDefault(author, 0) + 1);
        }

        return authorBookCountMap;
    }
}
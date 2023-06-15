package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {
    private List<Book> bookList;
    private Long bookId;

    public BookDatabaseImpl() {
        this.bookList = new ArrayList<>();
        this.bookId = 1L;
    }

    @Override
    public Long save(Book book) {
        book.setId(bookId);
        bookList.add(book);
        bookId++;
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
        for (Book b : bookList) {
            if (b.equals(book)) {
                bookList.remove(b);
                return true;
            }
        }
        return false;
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
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().toLowerCase().startsWith(author.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().toLowerCase().startsWith(title.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        bookList.removeIf(book -> book.getAuthor().equalsIgnoreCase(author));
    }

    @Override
    public void deleteByTitle(String title) {
        bookList.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (searchCriteria.match(book)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> foundAuthors = new TreeSet<>();
        for (Book book : bookList) {
            foundAuthors.add(book.getAuthor());
        }
        return foundAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> foundTitles = new TreeSet<>();
        for (Book book : bookList) {
            foundTitles.add(book.getTitle());
        }
        return foundTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new LinkedHashSet<>(bookList);
    }

    @Override
    public boolean contains(Book book) {
        return bookList.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorsToBooksMap = new TreeMap<>();
        for (Book book : bookList) {
            if (!authorsToBooksMap.containsKey(book.getAuthor())) {
                authorsToBooksMap.put(book.getAuthor(), new ArrayList<>());
            }
            authorsToBooksMap.get(book.getAuthor()).add(book);
        }
        return authorsToBooksMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> eachAuthorBookCount = new TreeMap<>();
        Set<Book> uniqueBookList = findUniqueBooks();
        for (Book book : uniqueBookList) {
            if (!eachAuthorBookCount.containsKey(book.getAuthor())) {
                eachAuthorBookCount.put(book.getAuthor(), 0);
            }
            int countBooks = eachAuthorBookCount.get(book.getAuthor());
            eachAuthorBookCount.put(book.getAuthor(), ++countBooks);
        }
        return eachAuthorBookCount;
    }
    @Override
    public List<Book> getBookList() {
        return bookList;
    }
}

package students.igors_gergeleziu.lesson_10.level_3;

class InMemoryDatabaseDemo {
    public static void main(String[] args) {
        Product tomato= new Product("Tomato");
        Product banana= new Product("Banana");
        InMemoryDatabase demo= new InMemoryDatabase();
        demo.save(tomato);
        demo.save(banana);
        System.out.println("Found in array: "+demo.findByTitle("Bread"));

    }
}

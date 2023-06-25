package students.jegors_rutkovskis.lesson_8.level_7.connect_four;

class Player {
    private String name;
    private Color pieceColor;

    public Player(String name, Color pieceColor) {
        this.name = name;
        this.pieceColor = pieceColor;
    }

    public String getName() {
        return name;
    }

    public Color getPieceColor() {
        return pieceColor;
    }
}

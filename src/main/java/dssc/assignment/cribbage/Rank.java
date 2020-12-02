package dssc.assignment.cribbage;

public enum Rank {
    ACE(1,'A'),
    TWO(2, '2'),
    THREE(3, '3'),
    FOUR(4, '4'),
    FIVE(5, '5'),
    SIX(6, '6'),
    SEVEN(7, '7'),
    EIGHT(8, '8'),
    NINE(9, '9'),
    TEN(10 ,'0'),
    JACK(10, 'J'),
    QUEEN(10, 'Q'),
    KING(10, 'K');

    private final int value;
    private final char character;


    Rank(int value, char character) {
        this.value = value;
        this.character = character;
    }

    public int getValue() {
        return this.value;
    }

    public char getCharacter() {
        return this.character;
    }
}

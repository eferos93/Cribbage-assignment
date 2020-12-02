package dssc.assignment.cribbage;

public enum Suite {
    HEART('H'),
    DIAMONDS('D'),
    SPADES('S'),
    CLUBS('C');

    private final char character;
    Suite(char character) {
        this.character = character;
    }
}

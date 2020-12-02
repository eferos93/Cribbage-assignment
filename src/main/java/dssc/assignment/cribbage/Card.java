package dssc.assignment.cribbage;

public class Card {
    private Suite suite;
    private Rank rank;

    public Card(Rank rank, Suite suite) {
        this.suite = suite;
        this.rank = rank;
    }

    public Rank rank() {
        return rank;
    }

    public Suite suite() {
        return suite;
    }
}

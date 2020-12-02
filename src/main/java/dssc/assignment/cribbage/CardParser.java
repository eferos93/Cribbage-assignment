package dssc.assignment.cribbage;

public class CardParser {
    public static Card parseCard(String cardAsText) throws InvalidHandException {
        if (cardAsText.length() != 2) {
            throw new InvalidHandException("The input string representing the card is not valid. Input's length: "
                    + cardAsText.length());
        }
        final char rankAsChar = cardAsText.charAt(0);
        Rank rank =
                switch (rankAsChar) {
                    case 'A' -> Rank.ACE;
                    case '2' -> Rank.TWO;
                    case '3' -> Rank.THREE;
                    case '4' -> Rank.FOUR;
                    case '5' -> Rank.FIVE;
                    case '6' -> Rank.SIX;
                    case '7' -> Rank.SEVEN;
                    case '8' -> Rank.EIGHT;
                    case '9' -> Rank.NINE;
                    case '0' -> Rank.TEN;
                    case 'J' -> Rank.JACK;
                    case 'Q' -> Rank.QUEEN;
                    case 'K' -> Rank.KING;
                    default -> throw new InvalidHandException("Rank value is not valid: " + rankAsChar);
        };

        final char suiteAsChar = cardAsText.charAt(1);

        Suite suite =
                switch (suiteAsChar) {
                    case 'C' -> Suite.CLUBS;
                    case 'D' -> Suite.DIAMONDS;
                    case 'H' -> Suite.HEART;
                    case 'S' -> Suite.SPADES;
                    default -> throw new InvalidHandException("Suite value is not valid " + suiteAsChar);
                };

        return new Card(rank, suite);
    }
}

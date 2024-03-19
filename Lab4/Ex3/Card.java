package Lab4.Ex3;

public class Card {
    enum Sign{
        CLUBS("Clubs"),
        DIAMONDS("Diamonds"),
        HEARTS("Hearts"),
        SPADES("Spades");

        final String name;
        Sign(String name){
            this.name = name;
        }
    }
    enum Value{
        TWO("Two"),
        THREE("Thee"),
        FOUR("Four"),
        FIVE("Five"),
        SIX("Six"),
        SEVEN("Seven"),
        EIGHT("Eight"),
        NINE("Nine"),
        TEN("Ten"),
        JACK("Jack"),
        QUEEN("Queen"),
        KING("King"),
        ACE("Ace");

        final String value;
        Value(String value){
            this.value = value;
        }
    }

    public void deck(){
        for (Sign sign : Sign.values()){
            for (Value value : Value.values()) {
                System.out.println(value.value + " of " + sign.name);
            }
        }
    }
}




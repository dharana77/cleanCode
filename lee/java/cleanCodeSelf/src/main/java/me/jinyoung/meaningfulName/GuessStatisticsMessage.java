package me.jinyoung.meaningfulName;

public class GuessStatisticsMessage {
    private String number;
    private String verb;
    private String pluralModifier;

    public String make(char candidate, int count){
        createPluralDependentMessageParts(count);
        return String.format(
                "There %s %s %s%S",
                verb, number, candidate, pluralModifier);
    }

    private void createPluralDependentMessageParts(int count){
        if (count == 0){
            thereAreNoLetters();
        }else if( count == 1){
            thereIsOneLetter();
        }else{
            thereAreManyLetters(count);
        }
    }

    private void thereAreManyLetters(int count){
        this.number = Integer.toString(count);
        this.verb = "are";
        this.pluralModifier = "s";
    }

    private void thereIsOneLetter() {
        this.number = "1";
        this.verb = "is";
        this.pluralModifier = "";
    }

    private void thereAreNoLetters(){
        this.number = "no";
        this.verb = "are";
        this.pluralModifier = "s";
    }
}

public class Nose extends CharacterDecorator {

    public Nose(Character character) {
        super(character);
    }

    public void customize() {
        sections.set(4, " |   >    | ");
    }
}

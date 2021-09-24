public class Mouth extends CharacterDecorator {

    public Mouth(Character character) {
        super(character);
    }

    public void customize() {
        sections.set(5, "  \\ ---- / ");
    }
}

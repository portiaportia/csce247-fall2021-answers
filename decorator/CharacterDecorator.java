public abstract class CharacterDecorator extends Character {
    protected Character character;

    public CharacterDecorator(Character character) {
        super();
        this.character = character;

        for (String originalSection : character.sections) {
            sections.add(originalSection);
        }
        customize();
    }

    public abstract void customize();
}

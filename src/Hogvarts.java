public class Hogvarts {
    String name;
    int silaMagii;
    int rassTransgressii;

    public Hogvarts(String name, int silaMagii, int rassTransgressii) {
        this.name = name;
        this.silaMagii = silaMagii;
        this.rassTransgressii = rassTransgressii;
    }

    @Override
    public String toString() {
        return "Студент Хогвартса " + name + "\n" +
                "сила магии: " + silaMagii + ", расстояние трансгрессии: " + rassTransgressii;
    }
}

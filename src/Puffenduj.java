public class Puffenduj extends Hogvarts{
    private int trudolyubie;
    private int vernost;
    private int chestnost;

    public Puffenduj(String name, int silaMagii, int rassTransgressii, int trudolyubie, int vernost, int chestnost) {
        super(name, silaMagii, rassTransgressii);
        this.trudolyubie = trudolyubie;
        this.vernost = vernost;
        this.chestnost = chestnost;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Факультут Пуфендуй \n" +
                "Качества: \n" +
                "trudolyubie=" + trudolyubie +
                ", vernost=" + vernost +
                ", chestnost=" + chestnost;
    }

    public int getTrudolyubie() {
        return trudolyubie;
    }

    public int getVernost() {
        return vernost;
    }

    public int getChestnost() {
        return chestnost;
    }
}

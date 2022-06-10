public class Griffindor extends Hogvarts{
    private int blagorodstvo;
    private int chest;
    private int hrabrost;


    public Griffindor(String name, int silaMagii, int rassTransgressii, int blagorodstvo, int chest, int hrabrost) {
        super(name, silaMagii, rassTransgressii);
        this.blagorodstvo = blagorodstvo;
        this.chest = chest;
        this.hrabrost = hrabrost;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Факультут Гриффиндор \n" +
                "Качества: \n" +
                "blagorodstvo=" + blagorodstvo +
                ", chest=" + chest +
                ", hrabrost=" + hrabrost;
    }

    public int getBlagorodstvo() {
        return blagorodstvo;
    }

    public int getChest() {
        return chest;
    }

    public int getHrabrost() {
        return hrabrost;
    }
}

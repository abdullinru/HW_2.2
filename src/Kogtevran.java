public class Kogtevran extends Hogvarts{
    private int um;
    private int mudrost;
    private int ostroumie;
    private int tvorchestvo;


    public Kogtevran(String name, int silaMagii, int rassTransgressii,  int um, int mudrost, int ostroumie, int tvorchestvo) {
        super(name, silaMagii, rassTransgressii);
        this.um = um;
        this.mudrost = mudrost;
        this.ostroumie = ostroumie;
        this.tvorchestvo = tvorchestvo;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Факультут Когтевран \n" +
                "Качества: \n" +
                "um=" + um +
                ", mudrost=" + mudrost +
                ", ostroumie=" + ostroumie +
                ", tvorchestvo=" + tvorchestvo;
    }

    public int getUm() {
        return um;
    }

    public int getMudrost() {
        return mudrost;
    }

    public int getOstroumie() {
        return ostroumie;
    }

    public int getTvorchestvo() {
        return tvorchestvo;
    }
}

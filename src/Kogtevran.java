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

    public void compare(Kogtevran kogtevran2) {
        int n1 = this.getMudrost() + this.getOstroumie() + this.getTvorchestvo() + this.getUm();
        int n2 = kogtevran2.getMudrost() + kogtevran2.getOstroumie() + kogtevran2.getTvorchestvo() + kogtevran2.getUm();
        if (n1 == n2) {
            System.out.printf("Студенты Когтеврана %s и %s равны по своим качествам%n", this.name, kogtevran2.name);
        }
        if (n1 > n2) {
            System.out.printf("%s лучше когтевранец , чем %s %n", this.name, kogtevran2.name);
        } else {
            System.out.printf("%s лучше когтевранец, чем %s %n", kogtevran2.name, this.name);
        }
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

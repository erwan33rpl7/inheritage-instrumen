package tugasbuPasya;

public class piano extends instrumen {
    String pianotype;

    public String getPianotype() {
        return this.pianotype;
    }

    public void setPianotype(String pianotype) {
        this.pianotype = pianotype;
    }

    public piano() {
        super();
        pianotype = "classic";
    }

    public piano(String name, double price,String pianotype) {
        super(name, price);
        this.pianotype = pianotype;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("nama: " + name);
        System.out.println("price: " + price);
        System.out.println("piano Type: " + pianotype);
    }
}

package tugasbuPasya;

public class Stringinstrumen extends instrumen {
    int numString;

    public int getNumString() {
        return this.numString;
    }

    public void setNumString(int numString) {
        this.numString = numString;
    }

    public Stringinstrumen() {
        super();
        numString = 4;
    }

    public Stringinstrumen(String name, double price,int numString) {
        super(name, price);
        this.numString = numString;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("nama: " + name);
        System.out.println("price: " + price);
        System.out.println("Number String: " + numString);
    }
}

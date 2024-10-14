package tugasbuPasya;

public class guitar extends instrumen {
    Boolean isElectric;

	public Boolean getIsElectric() {
		return this.isElectric;
	}

	public void setIsElectric(Boolean isElectric) {
		this.isElectric = isElectric;
	}


    public guitar() {
        super();
        isElectric = true;
    }

    public guitar(String name, double price,Boolean isisElectric) {
        super(name, price);
        this.isElectric = isElectric;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("nama: " + name);
        System.out.println("price: " + price);
        System.out.println("Is Electric?: " + isElectric);
    }
}
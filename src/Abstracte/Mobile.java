package Abstracte;

public abstract class Mobile {
    private String model;
    private String config;
    private int price;
    private String releaseDate;

    public Mobile() {
    }

    public void Mobile(String nModel, String nConfig, int nPrice, String nReleaseDate) {
        this.model = nModel;
        this.config = nConfig;
        this.price = nPrice;
        this.releaseDate = nReleaseDate;
    }

    public void Print() {
        System.out.println(this.model);
        System.out.println(this.config);
        System.out.println(this.price);
        System.out.println(this.releaseDate);
    }
}

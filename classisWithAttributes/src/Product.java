public class Product {

    // attribute || field
    private int id;
    private String name;
    private String description;
    private double prices;
    private int stockAmount;
    private String kod;


    /*
    // read only // getter
    public int getId() {
        //
        return _id;
    }

    public void setId(int id) {
        _id = id;
        // this.id = id; // this.id yapisi icinde bulundugum class demek
    } 
    */

    // otomatik yapmak icin sag tik ve source actiona bas
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrices() {
        return prices;
    }
    public void setPrices(double prices) {
        this.prices = prices;
    }
    public int getStockAmount() {
        return stockAmount;
    }
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
    public String getKod() {
        return kod = this.name.substring(0,1) + id;
    }
    
}
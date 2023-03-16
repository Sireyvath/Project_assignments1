package Stock;

public class stocks {
    private int id,qty,price, priceAtFull;
    private String name,in_Date;


    public stocks(int Id, String name, int qty, int price, int priceAtFull,String in_Date){
        this.id = Id;
        this.name=name;
        this.qty = qty;
        this.price=price;
        this.priceAtFull=priceAtFull;
        this.in_Date = in_Date;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public int getPrice() {
        return price;
    }

    public int getPriceAtFull() {
        return priceAtFull;
    }
    public  String getIn_Date(){ return in_Date;}
}


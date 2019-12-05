package grocery;

public class Groceries {
    private String name;
    private int amount;

    public Groceries(String newName, int newAmount){
        name = newName;
        amount = newAmount;
    }

    public String getName(){
        return name;
    }

    public int getAmount(){
        return amount;
    }

    public void changeAmount(int newAmount){
        amount = newAmount;
    }
}

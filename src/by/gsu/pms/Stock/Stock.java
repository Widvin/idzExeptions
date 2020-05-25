package by.gsu.pms;


public class Stock {
    private String name;
    private int cost;
    private boolean availability;

    public Stock(String name, int cost, boolean availability) {
        this.cost = cost;
        this.name = name;
        this.availability = availability;
    }
    public Stock(){}

    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;

    }


    public int getcost() {
        return cost;
    }

    public void setcost(int cost) {
        this.cost = cost;
    }


    public boolean getavailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


    public void show(){
        System.out.println("Name:" +name+ "  Cost:" +cost+ "  Availability:  " +availability);
    }
}
import by.gsu.pms.Stock;
import java.io.*;
import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

            String filename = "stock.dat";

            ArrayList<Stock> stocks = new ArrayList<Stock>();
            stocks.add(new Stock("bed", 200, true));
            stocks.add(new Stock("chair", 36, true));
            stocks.add(new Stock("mirror", 73, false));
            stocks.add(new Stock("table", 90, true));

            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
            {
                oos.writeObject(stocks);
                System.out.println("File has been written");
            }
            catch(Exception ex){

                System.out.println(ex.getMessage());
            }

        ArrayList<Stock> newStock= new ArrayList<Stock>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stock.dat")))
        {

            newStock=((ArrayList<Stock>)ois.readObject());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        for(Stock p : newStock)
            System.out.printf("Name: %s \t Cost: %d \n", p.getName(), p.getcost());

    }
}

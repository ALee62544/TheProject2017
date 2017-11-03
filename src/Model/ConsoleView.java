package Model;
import javafx.beans.property.SimpleStringProperty;

public class ConsoleView {
    private int id;
    private final SimpleStringProperty name;
    private final SimpleStringProperty manufacturer;
    public ConsoleView(int id, String name, String manufacturer){
        this.id = id;
        this.name = SimpleStringProperty(name);
        this.manufacturer = new SimpleStringProperty(manufacturer);
    }
    public int getId() {return id;}
    public String getName() {return name.get();}
    public String getManufacturer() {return manufacturer.get();}
}


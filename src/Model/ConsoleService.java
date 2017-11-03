package Model;

public class ConsoleService {
    public static void selectAll(List<Item> destination, DatabaseConnection  database) {}
    public static Console selectbyId(int id, DatabaseConnection database){}
    public static void save(Console console, DatabaseConnection database){} //most efficient way to insert and update
    public static void deletebyId(int id, DatabaseConnection database){}
    //service classes are used for SQL queries live, so data can be manipulated

}

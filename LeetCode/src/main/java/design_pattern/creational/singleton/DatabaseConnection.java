package design_pattern.creational.singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {}

    synchronized static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void query(String sql){
        // Database operations
    }

    static void main() {
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.query("select * from users");
    }
}

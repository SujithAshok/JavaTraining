import java.sql.*;

public class CRUD {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    // JDBC variables for opening, closing and managing connection
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    // Method to establish database connection
    public static void connect() throws SQLException {
        connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

    // Method to close database connection
    public static void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (resultSet != null) {
            resultSet.close();
        }
    }

    // Create operation: Insert a new record into the database
    public static void create(String name, int age, String department) throws SQLException {
        connect();
        statement = connection.createStatement();
        String query = String.format("INSERT INTO Employee (name, age, department) VALUES ('%s', %d, '%s')",
                name, age, department);
        statement.executeUpdate(query);
        System.out.println("Record inserted successfully!");
        close();
    }

    // Read operation: Fetch and display all records from the database
    public static void read() throws SQLException {
        connect();
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM Employee");
        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name") +
                    ", Age: " + resultSet.getInt("age") + ", Department: " + resultSet.getString("department"));
        }
        close();
    }

    // Update operation: Update an existing record in the database
    public static void update(int id, String name, int age, String department) throws SQLException {
        connect();
        statement = connection.createStatement();
        String query = String.format("UPDATE Employee SET name = '%s', age = %d, department = '%s' WHERE id = %d",
                name, age, department, id);
        statement.executeUpdate(query);
        System.out.println("Record updated successfully!");
        close();
    }

    // Delete operation: Delete a record from the database
    public static void delete(int id) throws SQLException {
        connect();
        statement = connection.createStatement();
        String query = String.format("DELETE FROM Employee WHERE id = %d", id);
        statement.executeUpdate(query);
        System.out.println("Record deleted successfully!");
        close();
    }

    public static void main(String[] args) {
        try {
            // Test CRUD operations
            create("John Doe", 30, "IT");
            create("Jane Smith", 25, "HR");

            System.out.println("Records before update:");
            read();

            update(1, "John Updated", 35, "Finance");

            System.out.println("Records after update:");
            read();

            delete(2);

            System.out.println("Records after delete:");
            read();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

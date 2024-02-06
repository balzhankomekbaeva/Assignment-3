import java.sql.*;


public class Main {
    public static void main(String[] args)
    {
        String stringConnection = "jdbc:postgresql://localhost:5432/postgres";
        Connection con = null;
        ResultSet rslt = null;
        Statement stmt = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(stringConnection, "postgres", "348576");
            stmt = con.createStatement();
            rslt = stmt.executeQuery("SELECT * FROM public.\"user\"\n" +
                    "ORDER BY id ASC");
            while(rslt.next())
            {
                System.out.println(rslt.getString("name"));
                System.out.println(rslt.getString("surname"));
            }
        }
        catch (SQLException e)
        {
            System.out.println("connection error: " + e.getMessage());
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Class not found" + e.getMessage());
        }
        finally
        {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.out.println("could not close the connection: " + e.getMessage());
                }
            }
        }

    }
}
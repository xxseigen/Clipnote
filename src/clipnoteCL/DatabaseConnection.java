/**
 *
 * @author Lecaros, Tracy Josh
 *         Naldoza, Catherine Marie
 * @version 1.0
 * @since 11/12/20
 * 
 */


package clipnoteCL;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DatabaseConnection {
    
    private static String serverName = "localhost";
    private static String username = "root";
    private static String nameDB = "users_account";
    private static Integer portNumber = 3306;
    private static String password = " ";
    
    
    /*
     * This method connects the program to the database.
     */
    public static Connection getConnection(){
        
        Connection database = null;
        
        MysqlDataSource sqlData = new MysqlDataSource();
        
        sqlData.setServerName(serverName);
        sqlData.setUser(username);
        sqlData.setPassword(password);
        sqlData.setDatabaseName(nameDB);
        sqlData.setPortNumber(portNumber);
        
        try {
            database = sqlData.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get connection -> " + DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return database;
    
    
    }
}

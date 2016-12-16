import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;


/**
 * Created by raylinares on 12/15/16.
 */
public class MySQLAdsDao implements Ads {
    private Connection connection;
}
    @Override
    // get a list of all the ads
    public List<Ad> all() {
        try {                                       //always put in a try/catch
            // 1. connect to database
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
            // 2. create statement object
            Statement stmt = connection.createStatement();

            // 3. query database with statement object
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            // 4. Process result set
            List<Ad> ads = new ArrayList<>();
            while (rs.next()){
                ads.add(new Ad(
                rs.getLong("id"),
                rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("Descripton")
                ));
            }
            return ads;

        }catch (SQLException e) {
            throw new RuntimeException("Error finding all the ads", e);
        }
    }
    // insert a new ad and return the new ad's id
    Long insert(Ad ad){
        try {                                       //always put in a try/catch
            // 1. connect to database
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
            // 2. create statement object
            Statement stmt = connection.createStatement();
            // 3. execute the statement with our sql based on it's type
            String insertQuery = "Insert Into ads(user_id, title, description)Values("
    }
}

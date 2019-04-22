import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {


    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            while (rs.next()) {
                Ad newAd = new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                ads.add(newAd);
            }
        } catch (SQLException e) {
            System.out.println("Problem connecting to database for read of ads");
            e.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        Long newAdId = 1L;
        String query = String.format("INSERT INTO ads(user_id, title, description) VALUES ('%d', '%s', '%s')", ad.getUserId(), ad.getTitle(), ad.getDescription());

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                newAdId = rs.getLong(1);
            }
        } catch (SQLException e) {
            System.out.println("Problem connecting to database for adding ad.");
        }
        return newAdId;
    }


    public static void main(String[] args) {
        try {
            MySQLAdsDao dao = new MySQLAdsDao(new Config());
            dao.insert(new Ad(1, "JDBC Ad", "Ad created in Java land"));

            for (Ad ad : dao.all()) {
                System.out.println(ad.getTitle());
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
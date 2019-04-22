import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() throws Exception {
        if (adsDao == null) {

            try {
                adsDao = new MySQLAdsDao(new Config());
            } catch (SQLException e) {
                throw new Exception("Problem connecting to DB");
            }
        }
        return adsDao;
    }
}

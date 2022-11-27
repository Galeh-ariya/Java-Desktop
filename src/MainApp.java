import java.sql.SQLException;
import view.BookView;

/**
 *
 * @author GALEH
 */
public class MainApp {
    
    public static void main(String[] args) throws SQLException {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookView().setVisible(true);
            }
        });
        
    }
}

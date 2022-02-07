import controller.ArticleController;
import controller.AuthorController;
import controller.MagazineController;
import model.Author;

import java.sql.Connection;

public class MainMagazine {

    public static void main(String[] args) {

        ConnectionFactory connectionFactory= new ConnectionFactory();
        Connection connection= connectionFactory.connect();

        ArticleController articleController= new ArticleController(connection);
        MagazineController magazineController= new MagazineController(connection);
        AuthorController authorController= new AuthorController(connection);




    }
}

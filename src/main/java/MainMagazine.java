import controller.ArticleController;
import controller.AuthorController;
import controller.MagazineController;
import model.Article;
import model.Author;
import model.Magazine;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

public class MainMagazine {

    public static void main(String[] args) {

        ConnectionFactory connectionFactory= new ConnectionFactory();
        Connection connection= connectionFactory.connect();

        ArticleController articleController= new ArticleController(connection);
        MagazineController magazineController= new MagazineController(connection);
        AuthorController authorController= new AuthorController(connection);

        ArrayList<Magazine> revistes = new ArrayList();

        Menu menu = new Menu();
        int opcio;

        opcio = menu.menuPral();

        switch (opcio) {

            case 1:

                System.out.println("!!!");

                try {

                    magazineController.printMagazines(articleController.readArticlesFile("src/main/resources/articles.txt", "src/main/resources/revistes.txt", "src/main/resources/autors.txt"));

                } catch (NumberFormatException | IOException e) {

                    e.printStackTrace();
                }
                break;

            default:
                System.out.println("Adeu!!");
                System.exit(1);
                break;

        }

    }

    public static void mostraRevistes(ArrayList<Magazine> revistes) {
        for (int i = 0; i < revistes.size(); i++) {

            System.out.println(revistes.get(i).toString());
            for (int j = 0; j < revistes.get(i).getArticlesList().size(); j++) {
                System.out.println("\t" + revistes.get(i).getArticle(j).toString());
                System.out.println("\t\t" + revistes.get(i).getArticle(j).getAuthor().toString());
            }

        }
    }

    public static Magazine seleccionaRevista(ArrayList<Magazine> revistes) {
        //TODO

        return null;
    }

    public static Article seleccionaArticle(ArrayList<Magazine> magazine) {
        //TODO

        return null;
    }
}



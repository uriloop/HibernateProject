package controller;


import java.sql.Connection;
import java.util.Scanner;

public class ArticleController {
    private Connection connection;
    private Scanner scan;

    public ArticleController(Connection connection) {
        this.connection = connection;
    }


}

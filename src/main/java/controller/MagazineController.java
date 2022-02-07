package controller;

import java.sql.Connection;
import java.util.Scanner;

public class MagazineController {

    private Connection connection;
    private Scanner scan;

    public MagazineController(Connection connection) {
        this.connection = connection;
    }
}

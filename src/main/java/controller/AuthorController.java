package controller;

import model.Author;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AuthorController {
    private Connection connection;

    public AuthorController(Connection connection) {
        this.connection = connection;
    }



    public void readAutorsFile(String filename) throws IOException {

        List<Author> llistaAuthors= new ArrayList<>();

        int id;
        String name, year, country;
        boolean active;

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String linea = "";
        while ((linea = br.readLine()) != null) {
            StringTokenizer str = new StringTokenizer(linea, ",");
            id = Integer.parseInt(str.nextToken());
            name = str.nextToken();
            year = str.nextToken();
            country = str.nextToken();
            active = Boolean.parseBoolean(str.nextToken());
            // System.out.println(id + name + country + year + active);
            llistaAuthors.add(new Author(id, name, country, year, active));

        }
        br.close();

    }


}

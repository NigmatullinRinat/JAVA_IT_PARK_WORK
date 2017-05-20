package com.company;

import java.sql.*;

public class Main {
    //language=SQL
    private static final String SELECT_ALL_USERS =
            "SELECT * FROM it_park_user";

    //language=SQL

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/NIGMATULLIN_DB",
                            "postgres",
                            "Zaq12wsx");

            Statement selectStatement
                    = connection.createStatement();

            ResultSet resultSet =
                    selectStatement.executeQuery(SELECT_ALL_USERS);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " +
                        resultSet.getString("name") + " " +
                        resultSet.getInt("age"));
            }
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}

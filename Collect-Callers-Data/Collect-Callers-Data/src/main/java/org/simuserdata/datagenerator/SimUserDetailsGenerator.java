// package org.simuserdata.datagenerator;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.sql.Statement;

// import com.github.javafaker.Faker;

// public class SimUserDetailsGenerator {

// public static void main(String[] args) {
// String jdbcUrl = "jdbc:mysql://localhost:3306/MOBILE_USERS"; // Update with
// your MySQL connection URL
// String username = "root"; // Update with your MySQL username
// String password = "Prince74482@sql"; // Update with your MySQL password

// try (Connection connection = DriverManager.getConnection(jdbcUrl, username,
// password);
// Statement statement = connection.createStatement()) {

// Faker faker = new Faker();

// for (int i = 0; i < 100; i++) {
// String simNumber = faker.phoneNumber().phoneNumber();
// String simUserName = faker.name().fullName();
// String emailAddress = faker.internet().emailAddress();
// String simNetwork = faker.options().option("Airtel", "Idea", "Jio", "BSNL");
// String simType = faker.options().option("Postpaid", "Prepaid");
// String simUserPlan = simType.equals("Postpaid") ? "Postpaid Family Plan"
// : faker.options().option("Month Plan", "3 Months Plan", "6 Months Plan");
// String simUserAddress = faker.address().fullAddress();

// // Insert the generated data into the table
// String insertQuery = String.format(
// "INSERT INTO SIM_USR_DTLS (SIM_NMBE, SIM_USR_NAME, EMAIL, SIM_NETWORK,
// SIM_TYP, SIM_PLAN, SIM_USER_ADRS) VALUES ('%s', '%s', '%s', '%s', '%s', '%s',
// '%s');",
// simNumber, simUserName, emailAddress, simNetwork, simType, simUserPlan,
// simUserAddress);

// // Execute the insert query
// statement.executeUpdate(insertQuery);
// }

// System.out.println("Fake data generation completed.");

// } catch (SQLException e) {
// e.printStackTrace();
// }
// }
// }

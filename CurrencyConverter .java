import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;
import okhttp3.*;

public class CurrencyConverter {

    

    public static void main(String[] args) {
        try {
            displayMenu();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void displayMenu() throws IOException {
        boolean running = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (running) {
            System.out.println("\nCurrency Converter Menu:");
            System.out.println("1. View available currencies");
            System.out.println("2. Add favorite currency");
            System.out.println("3. Remove favorite currency");
            System.out.println("4. Convert currency");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case 1:
                    viewAvailableCurrencies();
                    break;
                case 2:
                    addFavoriteCurrency();
                    break;
                case 3:
                    removeFavoriteCurrency();
                    break;
                case 4:
                    convertCurrency();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }

    private static void viewAvailableCurrencies() throws IOException {
        /*URL url = new URL(BASE_URL + "/symbols");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");*/
        OkHttpClient client = new OkHttpClient().newBuilder().build();

    Request request = new Request.Builder()
      .url("https://api.apilayer.com/currency_data/convert?to={to}&from={from}&amount={amount}")
      .addHeader("apikey", "{API-KEY}")
      .method("GET", })
      .build();
    Response response = client.newCall(request).execute();
    System.out.println(response.body().string());

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        System.out.println("Available Currencies:\n" + response.toString());
        reader.close();
        connection.disconnect();
    }

    private static void addFavoriteCurrency() {
        // Implement logic to add a favorite currency
        System.out.println("Adding favorite currency...");
    }

    private static void removeFavoriteCurrency() {
        // Implement logic to remove a favorite currency
        System.out.println("Removing favorite currency...");
    }

    private static void convertCurrency() {
        // Implement logic to convert currency
        System.out.println("Converting currency...");
    }
}

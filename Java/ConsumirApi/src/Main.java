package ConsumirApi.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void FormAction(HttpClient httpClient) {
        final HttpRequest requestPosts = HttpRequest.newBuilder().GET()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts")).build();

        try {
            final HttpResponse<String> response = httpClient.send(requestPosts, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Porfavor Ingrese el nombre de la moneda que quiera ver su precio");
        System.out.println("euro");
        System.out.println("dolar");
        System.out.println("real");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter the amount of day");
        String simbolo = keyboard.nextLine();

        final HttpRequest requestPosts = HttpRequest.newBuilder().GET()
                .uri(URI.create("https://www.dolarsi.com/api/api.php?type=" + simbolo)).build();

        try {
            final HttpResponse<String> response = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build()
                    .send(requestPosts, HttpResponse.BodyHandlers.ofString());
            String json = response.body().toString();
            BufferedReader br = new BufferedReader(new FileReader(json));
            String linea;
            while ((linea = br.readLine()) != null) {
                json += linea;
            }
            br.close();
            System.out.println(json);

        } catch (IOException | InterruptedException ex) {
            System.out.println(ex);
        }
        keyboard.close();
    }
}
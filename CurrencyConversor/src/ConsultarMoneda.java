import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {

    public Monedas buscaMoneda(String monedaBase, String monedaObjetivo) {

        URI webAddress = URI.create("https://v6.exchangerate-api.com/v6/9a7bf0d463c6cf91f18d9d7e/pair/"+monedaBase+"/"+monedaObjetivo);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(webAddress)
                .build();

        try {

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Monedas.class);

        }catch(Exception e){
            throw new RuntimeException("No encontré la moneda. Intenta de nuevo.");

        }
    }

}


package conexionApi;

import com.google.gson.Gson;
import modelos.Exchange;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionApi {


    public Exchange conexion(String base_currency,String target_currency,double amount){


        URI direction = URI.create("https://v6.exchangerate-api.com/v6/85313ea375a970cd8e7ed936/pair/"
                +base_currency+"/"
                +target_currency+"/"
                +amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direction)
                .build();
        
        try {
            
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Exchange.class);
            
        } catch (IOException  | InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        
      

    }


}

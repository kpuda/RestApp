package src;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class RestClient {

    public static void main(String[] args) throws IOException {
        URL url=new URL("https://catfact.ninja/fact");
        InputStreamReader reader=new InputStreamReader(url.openStream());

        CatFacts catFacts=new Gson().fromJson(reader,CatFacts.class);

        System.out.println(catFacts);

    }
}


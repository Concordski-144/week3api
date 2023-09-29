import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class ttc_api {
    private static final String API_URL = "https://myttc.ca/spadina_station.json";

    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        Request request = new Request.Builder()
                .url(API_URL)
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response);
            JSONObject responseBody = new JSONObject(response.body().string());
            System.out.println(responseBody.getString("name"));
        } catch (IOException|JSONException e) {
            throw new RuntimeException(e);
        }
    }
}

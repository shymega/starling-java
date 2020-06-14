package org.shymega.java.starlingbank.j4starling.http;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;

import java.io.IOException;

public class HTTPDo {
    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final JsonFactory JSON_FACTORY = new JacksonFactory();
    private static final HttpRequestFactory requestFactory = HTTP_TRANSPORT.createRequestFactory(
            (HttpRequest request) -> {
                request.setParser(new JsonObjectParser(JSON_FACTORY));
            });

    public void testt() throws IOException {
        HttpRequest req = requestFactory.buildGetRequest(new GenericUrl("https://clients3.google.com/generate_204"));
        HttpResponse resp = req.execute();
    }
}

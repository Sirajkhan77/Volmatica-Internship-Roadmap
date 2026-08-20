package Week7.Day3;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleHttpServer {

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(
                new InetSocketAddress(1500),
                0
        );
        httpServer.createContext("/hello", exchange -> {
            String method = exchange.getRequestMethod();
            if(!method.equals("GET")){
                String resp = "Method is not allowed.. ";
                exchange.getResponseHeaders().set("Content-Type", "text/plain");
                exchange.getResponseHeaders().set("Allow", "GET");
                exchange.sendResponseHeaders(405, resp.length());
                try (OutputStream stream = exchange.getResponseBody()){
                    stream.write(resp.getBytes());
                }
                return;
            }
            String response = "Oh Yeah, Wow.. You are a Pro Coder. Here is your response body nigga.. ";
            exchange.getResponseHeaders().set("Content-Type", "text/plain");
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream st = exchange.getResponseBody()){
                st.write(response.getBytes());
            }
        });
        httpServer.start();
        System.out.println("Server started at http://localhost:1500");
    }
}
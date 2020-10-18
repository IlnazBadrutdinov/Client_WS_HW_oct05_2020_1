package client.ws;
import javax.xml.ws.Endpoint;
public class WSClientHelloWorldPublisher {
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Endpoint.publish("http://localhost:8888/Client",
                new WSClientHelloWorld());

        System.out.println("Server is published!");

    }
}




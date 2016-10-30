package example;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;


public class HelloWorld {

    @GET
    @Produces()
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }
}

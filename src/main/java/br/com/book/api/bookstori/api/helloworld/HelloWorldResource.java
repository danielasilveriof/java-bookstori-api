package br.com.book.api.bookstori.api.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Sperling
 */
//path caminho
@Path("hello-world")
public class HelloWorldResource {
    
    @GET
    public String helloWorldMensagem(){
        return "Hello World Web Services em Java";
    }
    
}

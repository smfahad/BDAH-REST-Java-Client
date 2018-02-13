package org.bdah.rest.restClient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class App 
{
    public static void main( String[] args )
    {
    	// Initialize a client object through which we will request REST API
    	Client client = ClientBuilder.newClient();
    	
    	// Assigning a URL which REST web service to call
    	WebTarget target = client.target("http://localhost:8080/helloworld/hello");
    	
    	System.out.print(
    			// Request for the response
    			// Return  type to be HTML
    			// and the object type as String
    			target.request(MediaType.TEXT_HTML).get(String.class)
    			);
    }
}

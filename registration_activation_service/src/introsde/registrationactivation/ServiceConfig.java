package introsde.registrationactivation;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("registration-activation")
public class ServiceConfig extends ResourceConfig {
    public ServiceConfig () {
        packages("introsde.registrationactivation");
    }
}

package com.mkcoder.mycodingblog.largebookstore.runner.web;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.servlet.WebappContext;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.servlet.ServletRegistration;
import java.io.IOException;
import java.net.URI;
import java.util.Optional;

/**
 * Main class
 */
public class GrizzlyRunner {

    // Base URI the Grizzly HTTP server will listen on
    public static final String BASE_URI;
    public static final String protocol;
    public static final Optional<String> host;
    public static final String path;
    public static final Optional<String> port;

    static{
        protocol = "http://";
        host = Optional.ofNullable(System.getenv("HOSTNAME"));
        port = Optional.ofNullable(System.getenv("PORT"));
        path = "myapp";
        BASE_URI = protocol + host.orElse("localhost") + ":" + port.orElse("8080") + "/" + path + "/";
    }

        /**
     * Main method.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ServiceLocator locator = ServiceLocatorUtilities.createAndPopulateServiceLocator();
        ResourceConfig config = new ResourceConfig();
        final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), config);
        System.out.println(String.format("Jersey app started with WADL available at "
                + "%sapplication.wadl\nHit enter to stop it...", BASE_URI));
        // Initialize and register Jersey Servlet
        WebappContext context = new WebappContext("LargeBookstoreContext", "/myapp");
        context.addListener(org.springframework.web.context.ContextLoaderListener.class);
        context.addContextInitParameter("contextConfigLocation", "classpath:application-context.xml");
        ServletRegistration registration = context.addServlet("jersey-serlvet", org.glassfish.jersey.servlet.ServletContainer.class);
        registration.setInitParameter("javax.ws.rs.Application", "com.mkcoder.mycodingblog.largebookstore.rest.service.book.ApplicationResouce");
        registration.setInitParameter(ResourceConfig.class.getName(), ApplicationResouce.class.getName());
        registration.addMapping("/book");

        /*
        WebappContext ctx = new WebappContext("ctx", "/api");
        final ServletRegistration reg = ctx.addServlet("spring", new SpringServlet());
        reg.addMapping("/*");
        ctx.addContextInitParameter("contextConfigLocation", "classpath:applicationContext.xml");
        ctx.addListener("org.springframework.web.context.ContextLoaderListener");
        ctx.addListener("org.springframework.web.context.request.RequestContextListener");
        ctx.deploy(server);*/

        context.deploy(server);
        System.out.println("READY!");
        System.in.read();
    }
}
package com.mkcoder.mycodingblog.largebookstore.runner.core;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class ApplicationRunner {
    private static final String FINAL_URL = "http://localhost:5678/rest";

    public static void main(String[] args) {
        ConfigureGrizzlySeverAndServe();
    }

    private static void ConfigureGrizzlySeverAndServe() {
        ResourceConfig resourceConfig = new ResourceConfig();
        resourceConfig.packages("com.mkcoder.mycodingblog.largebookstore");
        System.out.println("registered resources: ");
        resourceConfig.getResources().forEach(r -> {
            System.out.println(r);
        });

        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(URI.create(FINAL_URL), resourceConfig);
        try {
            if ( !server.isStarted() ) server.start();
            System.out.println("Grizzly server started: " + FINAL_URL + " press enter to exit.");
            System.in.read();
            server.shutdown();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
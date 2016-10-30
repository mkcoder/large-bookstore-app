package com.mkcoder.mycodingblog.largebookstore.rest.service.authentication.resource;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.security.Key;
import java.sql.Date;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@Path("authenticate")
@Named
public class BasicLoginResource {

    private final Map<String, String> fakeUserDb;
    private static final String secret = "large-bookstore-app";

    public BasicLoginResource() {
        System.out.println("Hello from login");
        fakeUserDb = new HashMap<>();
        buildSomeFakeUsers();
    }

    private void buildSomeFakeUsers() {
        fakeUserDb.put("jdoe123", "passsword123");
        fakeUserDb.put("dummy", "hunter2");
        fakeUserDb.put("tester", "testtest123");
        fakeUserDb.put("ceoUser", "imakemoney");
        fakeUserDb.put("adminUser", "ipushpapers");
    }

    // returns a JWT to
    @GET
    @Path("/login")
    @Produces("text/plain")
    public String login(@QueryParam("username") @NotNull String username, @NotNull @QueryParam("password") String password) {
        System.out.println("username: " + username + " password: " + password);
        if ( fakeUserDb.containsKey(username) ) {
            if ( !fakeUserDb.get(username).equals(password) ) return "Either the username or password don't match";
            // if username and password are verified we can use the secret
            // begin authentication here
            String issues = "http://large-bookstore-app.dev";
            System.out.println("the secret is: " + secret);
            long iat = System.currentTimeMillis() / 1000L;
            long exp = iat + 60L;

            Map<String, Object> claims = new HashMap<>();
            claims.put("usr", username);
            claims.put("email", "fake@example.org");
            claims.put("clm", "basic");
            Key key = MacProvider.generateKey();

            System.out.println("Key: " + key);


            String compactJWS = Jwts.builder()
                    .setAudience("private")
                    .setIssuedAt(Date.from(Instant.EPOCH))
                    .setExpiration(Date.from(Instant.EPOCH.plusSeconds(1000)))
                    .setClaims(claims)
                    .signWith(SignatureAlgorithm.RS512, key)
                    .compact();

            return "Username found your SWT is: "+compactJWS;
        } else {
            return "Username not found";
        }
    }

}

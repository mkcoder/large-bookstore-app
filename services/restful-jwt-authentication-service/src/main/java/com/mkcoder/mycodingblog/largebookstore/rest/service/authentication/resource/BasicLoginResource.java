package com.mkcoder.mycodingblog.largebookstore.rest.service.authentication.resource;

import org.jose4j.base64url.Base64Url;
import org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers;
import org.jose4j.jwe.JsonWebEncryption;
import org.jose4j.jwe.KeyManagementAlgorithmIdentifiers;
import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jwk.RsaJwkGenerator;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.keys.AesKey;
import org.jose4j.lang.ByteUtil;
import org.jose4j.lang.JoseException;

import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.security.Key;
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
    public String login(@QueryParam("username") @NotNull String username, @NotNull @QueryParam("password") String password) throws JoseException {
        System.out.println("username: " + username + " password: " + password);
        if ( fakeUserDb.containsKey(username) ) {
            if ( !fakeUserDb.get(username).equals(password) ) return "Either the username or password don't match";
            // if username and password are verified we can use the secret
            // begin authentication here
            RsaJsonWebKey rsaJsonKey = RsaJwkGenerator.generateJwk(2048);
            rsaJsonKey.setKeyId( secret ); // this will be retrieved from the configuration panel

            JwtClaims claims = new JwtClaims();
            claims.setAudience("private");
            claims.setIssuer("http://large-bookstore-app.dev");
            claims.setExpirationTimeMinutesInTheFuture(1000);
            claims.setGeneratedJwtId();
            claims.setIssuedAtToNow();
            claims.setSubject(username);
            claims.setClaim("autz", "basic");
            claims.setClaim("pwd", Base64Url.encode(password.getBytes()));
            /*
                we will store a user password hashed in there
            * */

            Key key = new AesKey(ByteUtil.randomBytes(16));
            System.out.println("Key: " + key.getEncoded());
            System.out.println("Key: " + key.getAlgorithm());
            JsonWebEncryption jwe = new JsonWebEncryption();
            jwe.setPayload(claims.toJson());
            jwe.setAlgorithmHeaderValue(KeyManagementAlgorithmIdentifiers.A128KW);
            jwe.setEncryptionMethodHeaderParameter(ContentEncryptionAlgorithmIdentifiers.AES_128_CBC_HMAC_SHA_256);
            jwe.setKey(key);
            String jweSerialized = jwe.getCompactSerialization();
            claims.setClaim("pwd", jwe);


            System.out.println("Serialzed password: " + jweSerialized);
            jwe = new JsonWebEncryption();
            jwe.setKey(key);
            jwe.setCompactSerialization(jweSerialized);
            System.out.println("Unserialized password: " + jwe.getPayload());

            return "Username found your SWT is: " + jweSerialized;
        } else {
            return "Username not found";
        }
    }

}

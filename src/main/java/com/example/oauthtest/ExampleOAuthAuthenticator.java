
package com.example.oauthtest;

import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.base.Optional;



import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.apis.TwitterApi;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Token;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuthService;



public class ExampleOAuthAuthenticator implements Authenticator<String, User> {

    @Override
    public Optional<User> authenticate(String credentials) throws AuthenticationException {

	final OAuthService service = new ServiceBuilder()
	    .apiKey("")
	    .apiSecret("")
	    .provider(TwitterApi.class);

	
        //final Token requestToken = service.getRequestToken();
	

	final String requestToken = service.getAuthorizationUrl();
	/*
	  String authUrl = service.getAuthorizationUrl(requestToken);

	final Token accessToken = service.getAccessToken(requestToken, "verifier you got from the user/callback");

	final OAuthRequest request = new OAuthRequest(Verb.GET, "https://api.twitter.com/1.1/account/verify_credentials.json", service);
	service.signRequest(accessToken, request); // the access token from step 4
	final Response response = service.execute(request);
	*/
	System.out.println(service);
	return Optional.absent();
	/*
	if ("secret".equals(credentials.getPassword())) {
	    return Optional.of(new User(credentials.getUsername()));
	}
	return Optional.absent();
	*/
    }
}

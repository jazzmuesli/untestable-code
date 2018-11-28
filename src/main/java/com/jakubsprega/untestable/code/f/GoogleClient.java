package com.jakubsprega.untestable.code.f;

import com.google.common.annotations.VisibleForTesting;
import com.google.gson.Gson;

import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;

/**
 * Google client
 *
 * @author jakubsprega
 */
public class GoogleClient {

    //Google api url
    //"http://ajax.googleapis.com/ajax/services/search/web?v=1.0&q=";
    //"https://www.googleapis.com/customsearch/v1?q=mbank&cx=015547184213683567226:q0aasmrabq4&key=AIzaSyBUmnEafDAGujojypGkAxJtukT5yz2psOM";

    private final String googleApiUrl;
    private final Charset charset;
	private ContentProvider provider;

	public GoogleClient(String googleApiUrl, Charset charset) {
		this(googleApiUrl, charset, new URLContentProvider(charset));
	}
	
	@VisibleForTesting
    public GoogleClient(String googleApiUrl, Charset charset, ContentProvider provider) {
        this.googleApiUrl = googleApiUrl;
        this.charset = charset;
        this.provider = provider;
    }

    public GoogleResult search(String searchPhrase) throws Exception {
        String googleRequestUrl = String.format(
            "%s%s", googleApiUrl, URLEncoder.encode(searchPhrase, charset.name())
        );

        URL url = new URL(googleRequestUrl);
        String rawJsonGoogleResponse = provider.provideContent(url); 

        GoogleResult results = new Gson().fromJson(rawJsonGoogleResponse, GoogleResult.class);

        return results;
    }
}

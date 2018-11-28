package com.jakubsprega.untestable.code.f;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.Charset;

import com.google.common.io.CharStreams;

public class URLContentProvider implements ContentProvider {

	private Charset charset;

	public URLContentProvider(Charset charset) {
		this.charset = charset;
	}

	@Override
	public String provideContent(URL url) throws UnsupportedEncodingException, IOException {
		return CharStreams.toString(new InputStreamReader(url.openStream(), charset.name()));
	}

}

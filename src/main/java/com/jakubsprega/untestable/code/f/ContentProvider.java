package com.jakubsprega.untestable.code.f;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;

public interface ContentProvider {

	String provideContent(URL url) throws UnsupportedEncodingException, IOException;

}

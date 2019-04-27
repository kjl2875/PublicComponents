package com.github.kjl2875;

import java.net.URL;

/**
 * Eclipse 2018-12
 * Java 11.0.2
 * Maven Project
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	URL url = new URL("https://example.com/");
    	String r = URLDownload.Https.get(url);
    	System.out.println(r);
    }
}

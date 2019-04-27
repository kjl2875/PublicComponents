package com.github.kjl2875.Components;

import java.io.File;
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
    	//URL url = new URL("https://example.com/");
    	//String r = URLDownload.Https.get(url);
    	//System.out.println(r);
    	
    	URL url = new URL("https://example.com/");
    	File outputFile = new File("output.html");
    	URLDownload.Https.get(url,outputFile);
    }
}

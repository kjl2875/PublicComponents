package com.github.kjl2875.Components;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    	
    	//fcopy(new File("src"),new File("to"));
    }
    
    public static void fcopy(final File src, final File to) throws IOException
	{
		int len;
		char []buf = new char[1024 * 1024 * 4]; // 4MB
		
		BufferedReader br = new BufferedReader(new FileReader(src));
		BufferedWriter bw = new BufferedWriter(new FileWriter(to));
	
		try
		{
			while( (len = br.read(buf)) >= 0 ) {
				bw.write(buf, 0, len);
			}	
		}
		catch( IOException e )
		{
			//e.printStackTrace();
			
			bw.close();
			br.close();
			throw e;
		}
		
		bw.close();
		br.close();
	}
}

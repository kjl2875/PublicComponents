package com.github.kjl2875.Components;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class URLDownload
{
	static class Https
	{
		public static String get(URL url) throws IOException
		{
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			StringBuffer sb = new StringBuffer();
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String l;
			while((l = br.readLine()) != null)
			{
				sb.append(l);
				sb.append("\n");
			}
			conn.disconnect();
			
			return sb.toString();
		}
		
		public static void get(URL url, File outputFile) throws IOException
		{
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			InputStreamReader is = new InputStreamReader(conn.getInputStream());
			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(outputFile));
			char []buf = new char[1024];
			int len;
			
			while( 0 <= (len=is.read(buf)) )
			{
				out.write(buf, 0, len);
			}
			
			out.close();
			conn.disconnect();
		}
	}
}

package com.github.kjl2875.Components;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	}
}

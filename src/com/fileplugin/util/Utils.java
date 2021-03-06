package com.fileplugin.util;

import java.io.*;

public final class Utils {
	public static String fromInputStreamToString(InputStream inputStream) {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(inputStream));
		String readLine = "";
		StringBuilder stringBuilder = new StringBuilder();
		try {
			while ((readLine = bufferedReader.readLine()) != null) {
				stringBuilder.append(readLine + "\n");
			}
			inputStream.close();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stringBuilder.toString();
	}
}

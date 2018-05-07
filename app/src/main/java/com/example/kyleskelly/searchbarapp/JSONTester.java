package com.example.kyleskelly.searchbarapp;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.*;


/**
 * Quick class written to make sure that the json is returning properly, using gson library.
 */

public class JSONTester {


	public static void main(String[] args) throws Exception {

		Gson g = new Gson();

		URL FDAServer = new URL("https://api.fda.gov/drug/label.json?");

		HttpURLConnection conn = (HttpURLConnection)
				FDAServer.openConnection();
		conn.setRequestProperty("User-Agent", "Mozilla/5.0");

		InputStreamReader inputStream = new InputStreamReader(conn.getInputStream(), "UTF-8");

		Medication advil = g.fromJson(inputStream, Medication.class);


		System.out.println(advil);
	}
}
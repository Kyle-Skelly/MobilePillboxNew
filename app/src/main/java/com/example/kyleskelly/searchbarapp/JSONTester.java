package com.example.kyleskelly.searchbarapp;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.*;


/**
 * Quick class written to make sure that the json is returning properly, using gson library.
 */



<<<<<<< HEAD
	public static void main(String[] args) throws Exception {

		Gson g = new Gson();

		URL FDAServer = new URL("https://api.fda.gov/drug/label.json?");

		HttpURLConnection conn = (HttpURLConnection)
				FDAServer.openConnection();
		conn.setRequestProperty("User-Agent", "Mozilla/5.0");

		InputStreamReader inputStream = new InputStreamReader(conn.getInputStream(), "UTF-8");

		Medication advil = g.fromJson(inputStream, Medication.class);
=======

	public class JSONTester {

	
		public static void main(String[] args) throws Exception {
                
	
	        Gson g = new Gson();
                String drug;
	 
	        URL FDAServer = new URL("https://api.fda.gov/drug/label.json?search=brand_name:"+ drug);

	        HttpURLConnection conn = (HttpURLConnection)

	                FDAServer.openConnection();
          
  

	        conn.setRequestProperty("User-Agent", "Mozilla/5.0");
>>>>>>> cfa902339d74b2aa9b207b5dbb166c1b5efd8fd7

          	int responseCode = conn.getResponseCode();
	
			System.out.println("Response Code : " + responseCode);

<<<<<<< HEAD
		System.out.println(advil);
	}
}
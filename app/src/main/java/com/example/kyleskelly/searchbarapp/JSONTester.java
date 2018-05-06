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
                String drug;
	 
	        URL FDAServer = new URL("https://api.fda.gov/drug/label.json?search=brand_name:"+ drug);

	        HttpURLConnection conn = (HttpURLConnection)

	                FDAServer.openConnection();
          
  

	        conn.setRequestProperty("User-Agent", "Mozilla/5.0");

          	int responseCode = conn.getResponseCode();
	
			System.out.println("Response Code : " + responseCode);

                //read the InputStreamReader
	        BufferedReader inputStream = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			
          String inputLine;
         
          String finalString = "";
          while ((inputLine = inputStream.readLine()) != null) {
			 System.out.println(inputLine);
            finalString+=inputLine;
		}
		inputStream.close();
     

          
          
          
	  Medication medicine = g.fromJson(finalString, Medication.class);
	  System.out.println(medicine.toString());

	    }

	}

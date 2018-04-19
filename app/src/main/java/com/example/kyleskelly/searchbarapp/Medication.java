package com.example.kyleskelly.searchbarapp;

import java.net.URL;
import java.util.Arrays;
import com.google.gson.*;

public class Medication {

    private Results[] results;

    public Medication(Results[] results) {
        this.results = results;
    }

    public Results[] getResults() {
        return results;
    }

    public void setResults(Results[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "results=" + Arrays.toString(results) +
                '}';
    }
}
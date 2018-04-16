package com.example.kyleskelly.searchbarapp;

import java.net.URL;
import java.util.Arrays;

public class Medication {
    private NestedMedication[] NestedMedication;

    public Medication(com.example.kyleskelly.searchbarapp.NestedMedication[] nestedMedication) {
        NestedMedication = nestedMedication;
    }

    public com.example.kyleskelly.searchbarapp.NestedMedication[] getNestedMedication() {
        return NestedMedication;
    }

    public void setNestedMedication(com.example.kyleskelly.searchbarapp.NestedMedication[] nestedMedication) {
        NestedMedication = nestedMedication;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "NestedMedication=" + Arrays.toString(NestedMedication) +
                '}';
    }
}

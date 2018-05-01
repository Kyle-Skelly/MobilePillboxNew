package com.example.kyleskelly.searchbarapp;

import java.util.Arrays;

public class Results {
     private int effective_time;
     private String[] inactive_ingredient;
     private String[] keep_out_of_reach_of_children;
     private String[] purpose;
     private String[] warnings;
     private String[] questions;
     private String[] spl_product_data_elements;

    public Results(int effective_time, String[] inactive_ingredient, String[] keep_out_of_reach_of_children, String[] purpose, String[] warnings, String[] questions, String[] spl_product_data_elements) {
        this.effective_time = effective_time;
        this.inactive_ingredient = inactive_ingredient;
        this.keep_out_of_reach_of_children = keep_out_of_reach_of_children;
        this.purpose = purpose;
        this.warnings = warnings;
        this.questions = questions;
        this.spl_product_data_elements = spl_product_data_elements;
    }

    public int getEffective_time() {
        return effective_time;
    }

    public void setEffective_time(int effective_time) {
        this.effective_time = effective_time;
    }

    public String[] getInactive_ingredient() {
        return inactive_ingredient;
    }

    public void setInactive_ingredient(String[] inactive_ingredient) {
        this.inactive_ingredient = inactive_ingredient;
    }

    public String[] getKeep_out_of_reach_of_children() {
        return keep_out_of_reach_of_children;
    }

    public void setKeep_out_of_reach_of_children(String[] keep_out_of_reach_of_children) {
        this.keep_out_of_reach_of_children = keep_out_of_reach_of_children;
    }

    public String[] getPurpose() {
        return purpose;
    }

    public void setPurpose(String[] purpose) {
        this.purpose = purpose;
    }

    public String[] getWarnings() {
        return warnings;
    }

    public void setWarnings(String[] warnings) {
        this.warnings = warnings;
    }

    public String[] getQuestions() {
        return questions;
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public String[] getSpl_product_data_elements() {
        return spl_product_data_elements;
    }

    public void setSpl_product_data_elements(String[] spl_product_data_elements) {
        this.spl_product_data_elements = spl_product_data_elements;
    }

    @Override
    public String toString() {
        return "Results{" +
                "effective_time=" + effective_time +
                ", inactive_ingredient=" + Arrays.toString(inactive_ingredient) +
                ", keep_out_of_reach_of_children=" + Arrays.toString(keep_out_of_reach_of_children) +
                ", purpose=" + Arrays.toString(purpose) +
                ", warnings=" + Arrays.toString(warnings) +
                ", questions=" + Arrays.toString(questions) +
                ", spl_product_data_elements=" + Arrays.toString(spl_product_data_elements) +
                '}';
    }

}

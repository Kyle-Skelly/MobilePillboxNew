package com.example.kyleskelly.searchbarapp;

public class Results {
    private int effective_time;
    private String inactive_ingredient;
    private String keep_out_of_reach_of_children;
    private String purpose;

    public Results(int effective_time, String inactive_ingredient, String keep_out_of_reach_of_children, String purpose) {
        this.effective_time = effective_time;
        this.inactive_ingredient = inactive_ingredient;
        this.keep_out_of_reach_of_children = keep_out_of_reach_of_children;
        this.purpose = purpose;
    }

    public int getEffective_time() {
        return effective_time;
    }

    public void setEffective_time(int effective_time) {
        this.effective_time = effective_time;
    }

    public String getInactive_ingredient() {
        return inactive_ingredient;
    }

    public void setInactive_ingredient(String inactive_ingredient) {
        this.inactive_ingredient = inactive_ingredient;
    }

    public String getKeep_out_of_reach_of_children() {
        return keep_out_of_reach_of_children;
    }

    public void setKeep_out_of_reach_of_children(String keep_out_of_reach_of_children) {
        this.keep_out_of_reach_of_children = keep_out_of_reach_of_children;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Results{" +
                "effective_time=" + effective_time +
                ", inactive_ingredient='" + inactive_ingredient + '\'' +
                ", keep_out_of_reach_of_children='" + keep_out_of_reach_of_children + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}

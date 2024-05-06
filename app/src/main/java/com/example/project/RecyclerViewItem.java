package com.example.project;

import com.google.gson.annotations.SerializedName;

public class RecyclerViewItem {

        @SerializedName("name")
        private String title;
        private String ID;
        @SerializedName("growth")
        private String Size;
        @SerializedName("maturityWeeks")
        private String company;
        @SerializedName("color")
        private String location;
        @SerializedName("form")
        private int category;
        private int cost;

        public int getCost() {
            return cost;
        }

    public RecyclerViewItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        category = category;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "RecyclerViewItem{" +
                "Potato name: '" + title + '\'' +
                ", ID='" + ID + '\'' +
                ", Growth in weeks: '" + Size + '\'' +
                ", MaturityWeeks: '" + company + '\'' +
                ", Color: '" + location + '\'' +
                ", Form: " + category +
                ", cost=" + cost +
                '}';
    }
}




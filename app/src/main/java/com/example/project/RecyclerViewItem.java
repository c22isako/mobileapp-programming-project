package com.example.project;

import com.google.gson.annotations.SerializedName;

public class RecyclerViewItem {
    @SerializedName("name") // name
        private String title;
        private String ID; // Unused
        @SerializedName("Company") // Growth months
        private int size;
        @SerializedName("size") // time in weeks to grow
        private String company;
        @SerializedName("location") // Color
        private String location;
        @SerializedName("category") // Form
        private String category;
        private int cost; // Unused

        public int getCost() {
            return cost;
        }

    public RecyclerViewItem(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    public void setSize(String size) {
        size = size;
    }
    public int getSize() {
        return size;
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

    public String getCategory() {
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
                "title='" + title + '\'' +
                ", ID='" + ID + '\'' +
                ", size=" + size +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }
}




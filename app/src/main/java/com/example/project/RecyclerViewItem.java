package com.example.project;

import com.google.gson.annotations.SerializedName;

public class RecyclerViewItem {

        @SerializedName("name")
        private String title;

        private String ID;
        private String type;
        private String company;
        private String location;
        private int size;
        private int cost;

        public RecyclerViewItem(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public String getID() {
            return ID;
        }

        public String getType() {
            return type;
        }

        public String getCompany() {
            return company;
        }

        public String getLocation() {
            return location;
        }

        public int getSize() {
            return size;
        }

        public int getCost() {
            return cost;
        }

        @Override
        public String toString() {
            return
                    " Name = " + title + '\n' +
                            " ID = " + ID + '\n' +
                            " type = " + type + '\n' +
                            " location = " + location + '\n' +
                            " size = " + size + + '\n' +
                            " cost = " + cost + '\n';

        }
    }




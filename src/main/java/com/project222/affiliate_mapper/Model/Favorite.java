package com.project222.affiliate_mapper.Model;

public class Favorite {
    String user_id;
    String date;
   String market_name;

   String market_info;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMarket_info() {
        return market_info;
    }

    public void setMarket_info(String market_info) {
        this.market_info = market_info;
    }

    public String getMarket_name() {
        return market_name;
    }

    public void setMarket_name(String market_name) {
        this.market_name = market_name;
    }
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}

package com.example.alimjan.android_sqlite_demo;

/**
 * Created by alimjan on 4/11/16.
 */
public class Products {

    private int _id;
    private String _productname;

    public Products(){

    }

    public Products(String productname){
        this._productname = productname;
    }

    public Products(int id){
        this._id = id;
    }

    public void setProductname(String productname){
        this._productname = productname;
    }

    public String getProductname(){
        return _productname;
    }

    public void setId(int id){
        this._id = id;
    }

    public int getId(){
        return _id;
    }
}

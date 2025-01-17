/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Supplier;

import java.util.ArrayList;

import model.OrderManagement.OrderItem;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.ProductManagement.ProductsReport;

/**
 *
 * @author kal bugrara
 */
public class Supplier {
    String name;
    ProductCatalog productcatalog;
   ProductsReport productsreport;
    public Supplier(String n){
        name = n;
        productcatalog = new ProductCatalog("software");
        
    }
    
    public ProductsReport prepareProductsReport(){
        
        productsreport = productcatalog.generatProductPerformanceReport();
        return productsreport;
    }
    
    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget(){
       
        if(productsreport==null) productsreport = prepareProductsReport();
       return productsreport.getProductsAlwaysAboveTarget();
       
    }
    
    public String getName(){
        return name;
    }
        public ProductCatalog getProductCatalog(){
        return productcatalog;
    }
    //add supplier product ..
    
    //update supplier product ...
    @Override
   public String toString(){
       return name;
       
   }

       public int getTotalSalesRevenue() {
        int totalRevenue = 0;
        for (Product product : productcatalog.getProductList()) {
            totalRevenue += product.getSalesVolume() * product.getTargetPrice();
        }
        return totalRevenue;
    }

    public int getTotalMargin() {
        int totalMargin = 0;
        for (Product product : productcatalog.getProductList()) {
            totalMargin += product.getOrderPricePerformance();
        }
        return totalMargin;
    }

        public double calculateTotalProfitMargin() {
        double totalRevenue = 0;
        double totalCost = 0;
        for (Product product : productcatalog.getProductList()) {
            for (OrderItem oi : product.getOrderItems()) {
                totalRevenue += oi.getActualPrice() * oi.getQuantity();
                totalCost += product.getFloorPrice() * oi.getQuantity();
            }
        }
        return (totalRevenue - totalCost) / totalRevenue;
    }



}

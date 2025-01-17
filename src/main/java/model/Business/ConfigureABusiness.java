/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import java.util.Random;

import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.MarketingManagement.MarketingPersonDirectory;
import model.MarketingManagement.MarketingPersonProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.EmployeeDirectory;
import model.Personnel.EmployeeProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.ProductManagement.ProductsReport;
import model.SalesManagement.SalesPersonDirectory;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

  public static Business initialize() {
    Business business = new Business("Xerox");
  // Create Persons
  PersonDirectory persondirectory = business.getPersonDirectory(); // create PersonDirectory

  Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");
  Person xeroxadminperson001 = persondirectory.newPerson("xerox admin");
  //10 persons for customers
  Person customer1 = persondirectory.newPerson("John Doe");
  Person customer2 = persondirectory.newPerson("Jane Doe");
  Person customer3 = persondirectory.newPerson("Jim Doe");
  Person customer4 = persondirectory.newPerson("Jill Doe");
  Person customer5 = persondirectory.newPerson("Jack Doe");
  Person customer6 = persondirectory.newPerson("Joe Doe");
  Person customer7 = persondirectory.newPerson("Jenny Doe");
  Person customer8 = persondirectory.newPerson("Jesse Doe");
  Person customer9 = persondirectory.newPerson("Jill Doe");
  Person customer10 = persondirectory.newPerson("Jill Doe");


  // Create Marketing people
  MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory(); //create MarketingPersonDirectory
  MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxmarketingperson001); // load MarketingPersonDirectory with 1 profile

  // Create Admin people
  EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
  EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

  // Create customer people 
  CustomerDirectory customerdirectory = business.getCustomerDirectory(); // create CustomerDirectory
  CustomerProfile customerprofile1 = customerdirectory.newCustomerProfile(customer1); // load CustomerDirectory with 10 profiles
  CustomerProfile customerprofile2 = customerdirectory.newCustomerProfile(customer2);
  CustomerProfile customerprofile3 = customerdirectory.newCustomerProfile(customer3);
  CustomerProfile customerprofile4 = customerdirectory.newCustomerProfile(customer4);
  CustomerProfile customerprofile5 = customerdirectory.newCustomerProfile(customer5);
  CustomerProfile customerprofile6 = customerdirectory.newCustomerProfile(customer6);
  CustomerProfile customerprofile7 = customerdirectory.newCustomerProfile(customer7);
  CustomerProfile customerprofile8 = customerdirectory.newCustomerProfile(customer8);
  CustomerProfile customerprofile9 = customerdirectory.newCustomerProfile(customer9);
  CustomerProfile customerprofile10 = customerdirectory.newCustomerProfile(customer10);


  // create suppliers
  SupplierDirectory suplierdirectory = business.getSupplierDirectory();

  // Supplier 1
  Supplier supplier1 = suplierdirectory.newSupplier("Lenovo"); // load first supplier
  ProductCatalog productcatalog1 = supplier1.getProductCatalog(); // create first supplier productCatalog
  productcatalog1.newProduct("Lenovo Laptop 1", 5553, 16500, 16747);
  productcatalog1.newProduct("Lenovo Laptop 2", 55454, 55665, 46746);
  productcatalog1.newProduct("Lenovo Printer 1", 4535, 848497, 848478);
  productcatalog1.newProduct("Lenovo Photocopier 1", 6645, 8484, 8484);
  productcatalog1.newProduct("Lenovo Scanner  1", 5554, 84748, 94944);
  productcatalog1.newProduct("Lenovo Scanner 2", 6464, 5645, 37383);
  productcatalog1.newProduct("Lenovo Printer 2", 64646, 76474, 4644);
  productcatalog1.newProduct("Lenovo Photocopier 2", 5746, 3563, 50000);
  productcatalog1.newProduct("Lenovo Printer 3", 5647, 9846, 36500);
  productcatalog1.newProduct("Lenovo Photocopier 3", 4663, 35638, 50000);

  // Supplier 2
  Supplier supplier2 = suplierdirectory.newSupplier("Dell");
  ProductCatalog productcatalog2 = supplier2.getProductCatalog();
  productcatalog2.newProduct("Dell Laptop 1", 5554, 5546, 6645);
  productcatalog2.newProduct("Dell Laptop 2", 555, 25000, 5542);
  productcatalog2.newProduct("Dell Printer 1", 7876, 40000, 99876);
  productcatalog2.newProduct("Dell Photocopier 1", 30000, 70000, 6654);
  productcatalog2.newProduct("Dell Scanner  1", 19000, 36500, 444453);
  productcatalog2.newProduct("Dell Scanner 2", 90000, 125000, 66653);
  productcatalog2.newProduct("Dell Printer 2", 22000, 60000, 7776);
  productcatalog2.newProduct("Dell Photocopier 2", 30000, 70000, 55542);
  productcatalog2.newProduct("Dell Printer 3", 22000, 60000, 55543);
  productcatalog2.newProduct("Dell Photocopier 3", 30000, 70000, 99892);

  // Supplier 3
  Supplier supplier3 = suplierdirectory.newSupplier("HP");
  ProductCatalog productcatalog3 = supplier3.getProductCatalog();
  productcatalog3.newProduct("HP Laptop 1", 2000, 16500, 5543);
  productcatalog3.newProduct("HP Laptop 2", 55545, 6666, 6678);
  productcatalog3.newProduct("HP Printer 1", 55436, 40000, 543);
  productcatalog3.newProduct("HP Photocopier 1", 55434, 55434, 5567);
  productcatalog3.newProduct("HP Scanner  1", 22345, 5543, 54543);
  productcatalog3.newProduct("HP Scanner 2", 90000, 555435, 7654234);
  productcatalog3.newProduct("HP Printer 2", 22000, 4443, 7789);
  productcatalog3.newProduct("HP Photocopier 2", 55434, 55567, 33345);
  productcatalog3.newProduct("HP Printer 3", 44324, 60000, 334532);
  productcatalog3.newProduct("HP Photocopier 3", 665, 76543457, 112343);

  // Supplier 4
  Supplier supplier4 = suplierdirectory.newSupplier("Acer");
  ProductCatalog productcatalog4 = supplier4.getProductCatalog();
  productcatalog4.newProduct("Acer Laptop 1", 2000, 16500, 4432);
  productcatalog4.newProduct("Acer Laptop 2", 10000, 25000, 2211);
  productcatalog4.newProduct("Acer Printer 1", 22000, 40000, 4432);
  productcatalog4.newProduct("Acer Photocopier 1", 30000, 70000, 66545);
  productcatalog4.newProduct("Acer Scanner  1", 19000, 36500, 7789);
  productcatalog4.newProduct("Acer Scanner 2", 90000, 125000, 45654);
  productcatalog4.newProduct("Acer Printer 2", 22000, 60000, 2234);
  productcatalog4.newProduct("Acer Photocopier 2", 5554, 34542, 7765);
  productcatalog4.newProduct("Acer Printer 3", 22000, 44785, 33343);
  productcatalog4.newProduct("Acer Photocopier 3", 30000, 4565, 9987);

  // Supplier 5
  Supplier supplier5 = suplierdirectory.newSupplier("Asus");
  ProductCatalog productcatalog5 = supplier5.getProductCatalog();
  productcatalog5.newProduct("Asus Laptop 1", 5567, 33211, 6654);
  productcatalog5.newProduct("Asus Laptop 2", 55123, 7789, 5543);
  productcatalog5.newProduct("Asus Printer 1", 88876, 33212, 5542);
  productcatalog5.newProduct("Asus Photocopier 1", 44455, 44432, 7897);
  productcatalog5.newProduct("Asus Scanner  1", 4432, 88877, 4456);
  productcatalog5.newProduct("Asus Scanner 2", 44455, 22444, 34564);
  productcatalog5.newProduct("Asus Printer 2", 456754, 33444, 55422);
  productcatalog5.newProduct("Asus Photocopier 2", 23432, 44567, 44568);
  productcatalog5.newProduct("Asus Printer 3", 22000, 5675, 3321);
  productcatalog5.newProduct("Asus Photocopier 3", 2234, 3333, 4456);
    
    





    // Print the supplier directory
    //printSupplierDirectory(suplierdirectory);

    // Generate orders
    MasterOrderList masterOrderList = new MasterOrderList();
    generateOrders(masterOrderList, customerdirectory, suplierdirectory);

    // print all orders 

    //printAllOrders(masterOrderList);

    // // Analyze price performance
    // analyzePricePerformance(suplierdirectory);

    // // Adjust target prices
    // //adjustTargetPrices(suplierdirectory);

    // // Calculate and print profit margins before adjustment
    // double profitMarginBefore = calculateTotalProfitMargin(suplierdirectory);
    // System.out.println("Total Profit Margin Before Adjustment: " + profitMarginBefore);

    // // Adjust target prices
    // adjustTargetPrices(suplierdirectory);

    // // Calculate and print profit margins after adjustment
    // double profitMarginAfter = calculateTotalProfitMargin(suplierdirectory);
    // System.out.println("Total Profit Margin After Adjustment: " + profitMarginAfter);

    // // Print the change in profit margin
    // System.out.println("Change in Profit Margin: " + (profitMarginAfter - profitMarginBefore));

    // // Maximize profit margins and get the final profit margin
    // double finalProfitMargin = maximizeProfitMargins(suplierdirectory);
    // System.out.println("Final Profit Margin After Maximizing: " + finalProfitMargin);









    return business;
  }
  private static void printSupplierDirectory(SupplierDirectory supplierDirectory) {
    for (Supplier supplier : supplierDirectory.getSuplierList()) {
      System.out.println("Supplier: " + supplier.getName());
      ProductCatalog productCatalog = supplier.getProductCatalog();
      for (Product product : productCatalog.getProductList()) {
        System.out.println("  Product: " + product.getName() + ", Target Price: " + product.getTargetPrice() + ", Ceiling Price: " + product.getCeilingPrice());
      }
    }
  }

  private static void generateOrders(MasterOrderList masterOrderList, CustomerDirectory customerDirectory, SupplierDirectory supplierDirectory) {
    Random random = new Random();
    for (CustomerProfile customer : customerDirectory.getCustomerList()) {
      for (Supplier supplier : supplierDirectory.getSuplierList()) {
        ProductCatalog productCatalog = supplier.getProductCatalog();
        for (Product product : productCatalog.getProductList()) {
          for (int i = 0; i < 10; i++) { // 10 orders per product
            Order order = masterOrderList.newOrder(customer);
            int actualPrice = product.getTargetPrice() + random.nextInt(2000) - 1000; // Varying actual prices
            int quantity = random.nextInt(10) + 1; // Random quantity between 1 and 10
            order.newOrderItem(product, actualPrice, quantity);
          }
        }
      }
    }

  }

  private static void printAllOrders(MasterOrderList masterOrderList) {
    for (Order order : masterOrderList.getOrders()) {
      CustomerProfile customer = order.getCustomer();
      System.out.println("Order for Customer: " + customer.getPerson().getPersonId());
      for (OrderItem orderItem : order.getOrderItems()) {
        Product product = orderItem.getProduct();
        System.out.println("  Product: " + product.getName() + ", Actual Price: " + orderItem.getActualPrice() + ", Quantity: " + orderItem.getQuantity() + ", Total: " + orderItem.getOrderItemTotal());
      }
    }
  }


  private static void analyzePricePerformance(SupplierDirectory supplierDirectory) {
    for (Supplier supplier : supplierDirectory.getSuplierList()) {
      ProductCatalog productCatalog = supplier.getProductCatalog();
      for (Product product : productCatalog.getProductList()) {
        int totalSalesRevenue = 0;
        int totalTargetRevenue = 0;
        int totalPricePerformance = 0;
        int numberOfSalesAboveTarget = 0;
        int numberOfSalesBelowTarget = 0;

        for (OrderItem orderItem : product.getOrderItems()) {
          totalSalesRevenue += orderItem.getOrderItemTotal();
          totalTargetRevenue += orderItem.getOrderItemTargetTotal();
          totalPricePerformance += orderItem.calculatePricePerformance();
          if (orderItem.getActualPrice() > product.getTargetPrice()) {
            numberOfSalesAboveTarget++;
          } else if (orderItem.getActualPrice() < product.getTargetPrice()) {
            numberOfSalesBelowTarget++;
          }
        }

        System.out.println("Product: " + product.getName());
        System.out.println("  Total Sales Revenue: " + totalSalesRevenue);
        System.out.println("  Total Target Revenue: " + totalTargetRevenue);
        System.out.println("  Total Price Performance: " + totalPricePerformance);
        System.out.println("  Number of Sales Above Target: " + numberOfSalesAboveTarget);
        System.out.println("  Number of Sales Below Target: " + numberOfSalesBelowTarget);
      }
    }
  }


  private static void adjustTargetPrices(SupplierDirectory supplierDirectory) {
    for (Supplier supplier : supplierDirectory.getSuplierList()) {
      ProductCatalog productCatalog = supplier.getProductCatalog();
      for (Product product : productCatalog.getProductList()) {
        int numberOfSalesAboveTarget = 0;
        int numberOfSalesBelowTarget = 0;

        for (OrderItem orderItem : product.getOrderItems()) {
          if (orderItem.getActualPrice() > product.getTargetPrice()) {
            numberOfSalesAboveTarget++;
          } else if (orderItem.getActualPrice() < product.getTargetPrice()) {
            numberOfSalesBelowTarget++;
          }
        }

        if (numberOfSalesBelowTarget > numberOfSalesAboveTarget) {
          product.updateProduct(product.getFloorPrice(), product.getCeilingPrice(), product.getTargetPrice() - 1000); // Lower target price
          System.out.println("Lowering target price for product: " + product.getName() + " to " + product.getTargetPrice());
        } else if (numberOfSalesAboveTarget > numberOfSalesBelowTarget) {
          product.updateProduct(product.getFloorPrice(), product.getCeilingPrice(), product.getTargetPrice() + 1000); // Increase target price
          System.out.println("Increasing target price for product: " + product.getName() + " to " + product.getTargetPrice());
        }
      }
    }
  }

  private static double calculateTotalProfitMargin(SupplierDirectory supplierDirectory) {
    double totalProfit = 0;
    double totalRevenue = 0;

    for (Supplier supplier : supplierDirectory.getSuplierList()) {
      ProductCatalog productCatalog = supplier.getProductCatalog();
      for (Product product : productCatalog.getProductList()) {
        for (OrderItem orderItem : product.getOrderItems()) {
          totalRevenue += orderItem.getOrderItemTotal();
          totalProfit += orderItem.calculatePricePerformance();
        }
      }
    }

    return totalProfit / totalRevenue * 100;
  }


  private static void runSimulation(SupplierDirectory supplierDirectory) {
    System.out.println("Running simulation...");
    for (Supplier supplier : supplierDirectory.getSuplierList()) {
      ProductCatalog productCatalog = supplier.getProductCatalog();
      for (Product product : productCatalog.getProductList()) {
        int totalSalesRevenue = 0;
        for (OrderItem orderItem : product.getOrderItems()) {
          totalSalesRevenue += orderItem.getOrderItemTotal();
        }
        System.out.println("Product: " + product.getName() + ", Total Sales Revenue: " + totalSalesRevenue);
      }
    }
  }

  private static double maximizeProfitMargins(SupplierDirectory supplierDirectory) {
    System.out.println("Maximizing profit margins...");
    boolean pricesAdjusted;
    int iterationCount = 0;
    //int maxIterations = 100; // Set a maximum number of iterations to prevent infinite loop

    do {
        pricesAdjusted = false;
        for (Supplier supplier : supplierDirectory.getSuplierList()) {
            ProductCatalog productCatalog = supplier.getProductCatalog();
            for (Product product : productCatalog.getProductList()) {
                int numberOfSalesAboveTarget = 0;
                int numberOfSalesBelowTarget = 0;

                for (OrderItem orderItem : product.getOrderItems()) {
                    if (orderItem.getActualPrice() > product.getTargetPrice()) {
                        numberOfSalesAboveTarget++;
                    } else if (orderItem.getActualPrice() < product.getTargetPrice()) {
                        numberOfSalesBelowTarget++;
                    }
                }

                if (numberOfSalesBelowTarget > numberOfSalesAboveTarget) {
                    product.updateProduct(product.getFloorPrice(), product.getCeilingPrice(), product.getTargetPrice() - 2222500); // Lower target price
                    pricesAdjusted = true;
                    //System.out.println("Lowering target price for product: " + product.getName() + " to " + product.getTargetPrice());
                } else if (numberOfSalesAboveTarget > numberOfSalesBelowTarget) {
                    product.updateProduct(product.getFloorPrice(), product.getCeilingPrice(), product.getTargetPrice() + 22333500); // Increase target price
                    pricesAdjusted = true;
                    //System.out.println("Increasing target price for product: " + product.getName() + " to " + product.getTargetPrice());
                }
            }
        }
        iterationCount++;
    } while (pricesAdjusted && iterationCount < 100); // Repeat until no more price adjustments are made or max iterations reached

    // if (iterationCount >= maxIterations) {
    //     System.out.println("Max iterations reached. Stopping price adjustments to prevent infinite loop.");
    // }

    // Calculate and return profit margins after maximizing
    return calculateTotalProfitMargin(supplierDirectory);
  }


















}

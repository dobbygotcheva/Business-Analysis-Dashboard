package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChartData {
    private List<MonthlySales> monthlySales;
    private List<ProductCategory> productCategories;
    private List<TemperatureData> temperatureData;
    private Random random = new Random();

    public ChartData() {
        // Initialize with sample data
        initializeMonthlySales();
        initializeProductCategories();
        initializeTemperatureData();
    }

    private void initializeMonthlySales() {
        monthlySales = new ArrayList<>();
        // Full year of sales data with realistic seasonal variations
        monthlySales.add(new MonthlySales("Jan", 1250 + random.nextInt(200)));
        monthlySales.add(new MonthlySales("Feb", 1400 + random.nextInt(200)));
        monthlySales.add(new MonthlySales("Mar", 1800 + random.nextInt(300)));
        monthlySales.add(new MonthlySales("Apr", 2100 + random.nextInt(300)));
        monthlySales.add(new MonthlySales("May", 2400 + random.nextInt(400)));
        monthlySales.add(new MonthlySales("Jun", 2800 + random.nextInt(400)));
        monthlySales.add(new MonthlySales("Jul", 3000 + random.nextInt(500)));
        monthlySales.add(new MonthlySales("Aug", 2900 + random.nextInt(400)));
        monthlySales.add(new MonthlySales("Sep", 2600 + random.nextInt(300)));
        monthlySales.add(new MonthlySales("Oct", 2200 + random.nextInt(300)));
        monthlySales.add(new MonthlySales("Nov", 2500 + random.nextInt(400))); // Holiday season boost
        monthlySales.add(new MonthlySales("Dec", 3200 + random.nextInt(500))); // Holiday season peak
    }

    private void initializeProductCategories() {
        productCategories = new ArrayList<>();
        // More detailed product categories with realistic market distribution
        productCategories.add(new ProductCategory("Electronics", 28));
        productCategories.add(new ProductCategory("Clothing", 22));
        productCategories.add(new ProductCategory("Home & Kitchen", 15));
        productCategories.add(new ProductCategory("Books & Media", 12));
        productCategories.add(new ProductCategory("Beauty & Health", 10));
        productCategories.add(new ProductCategory("Sports & Outdoors", 8));
        productCategories.add(new ProductCategory("Toys & Games", 5));
    }

    private void initializeTemperatureData() {
        temperatureData = new ArrayList<>();
        // Full year of temperature data with realistic seasonal variations
        // Northern hemisphere pattern (adjust if needed for southern hemisphere)
        temperatureData.add(new TemperatureData("Jan", 2 + random.nextInt(3)));
        temperatureData.add(new TemperatureData("Feb", 3 + random.nextInt(3)));
        temperatureData.add(new TemperatureData("Mar", 8 + random.nextInt(4)));
        temperatureData.add(new TemperatureData("Apr", 14 + random.nextInt(4)));
        temperatureData.add(new TemperatureData("May", 19 + random.nextInt(5)));
        temperatureData.add(new TemperatureData("Jun", 24 + random.nextInt(5)));
        temperatureData.add(new TemperatureData("Jul", 27 + random.nextInt(5)));
        temperatureData.add(new TemperatureData("Aug", 26 + random.nextInt(5)));
        temperatureData.add(new TemperatureData("Sep", 22 + random.nextInt(4)));
        temperatureData.add(new TemperatureData("Oct", 16 + random.nextInt(4)));
        temperatureData.add(new TemperatureData("Nov", 9 + random.nextInt(4)));
        temperatureData.add(new TemperatureData("Dec", 4 + random.nextInt(3)));
    }

    // Getters
    public List<MonthlySales> getMonthlySales() { return monthlySales; }
    public List<ProductCategory> getProductCategories() { return productCategories; }
    public List<TemperatureData> getTemperatureData() { return temperatureData; }

    // Inner classes for data models
    public static class MonthlySales {
        private String month;
        private int sales;

        public MonthlySales(String month, int sales) {
            this.month = month;
            this.sales = sales;
        }

        public String getMonth() { return month; }
        public int getSales() { return sales; }
    }

    public static class ProductCategory {
        private String category;
        private int percentage;

        public ProductCategory(String category, int percentage) {
            this.category = category;
            this.percentage = percentage;
        }

        public String getCategory() { return category; }
        public int getPercentage() { return percentage; }
    }

    public static class TemperatureData {
        private String month;
        private int temperature;

        public TemperatureData(String month, int temperature) {
            this.month = month;
            this.temperature = temperature;
        }

        public String getMonth() { return month; }
        public int getTemperature() { return temperature; }
    }
} 

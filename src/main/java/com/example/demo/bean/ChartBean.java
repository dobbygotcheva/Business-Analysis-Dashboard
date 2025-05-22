package com.example.demo.bean;

import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Component
@Named("chartBean")
@ViewScoped
public class ChartBean implements Serializable {
    private static final Logger logger = LoggerFactory.getLogger(ChartBean.class);
    private static final long serialVersionUID = 1L;

    private BarChartModel barModel;
    private PieChartModel pieModel;
    private LineChartModel lineModel;

    public ChartBean() {
        logger.debug("Initializing ChartBean");
        createBarModel();
        createPieModel();
        createLineModel();
    }

    private void createBarModel() {
        logger.debug("Creating bar model");
        barModel = new BarChartModel();
        ChartSeries sales = new ChartSeries();
        sales.setLabel("Sales");
        sales.set("2015", 1200);
        sales.set("2016", 1500);
        sales.set("2017", 1800);
        sales.set("2018", 2100);
        sales.set("2019", 2400);
        barModel.addSeries(sales);
        barModel.setTitle("Sales Performance");
        barModel.setLegendPosition("ne");
        barModel.setShowPointLabels(true);
        logger.debug("Bar model created successfully");
    }

    private void createPieModel() {
        logger.debug("Creating pie model");
        pieModel = new PieChartModel();
        pieModel.set("Category A", 540);
        pieModel.set("Category B", 325);
        pieModel.set("Category C", 702);
        pieModel.set("Category D", 421);
        pieModel.setTitle("Product Categories");
        pieModel.setLegendPosition("w");
        logger.debug("Pie model created successfully");
    }

    private void createLineModel() {
        logger.debug("Creating line model");
        lineModel = new LineChartModel();
        LineChartSeries series = new LineChartSeries();
        series.setLabel("Temperature");
        series.set(1, 10);
        series.set(2, 12);
        series.set(3, 15);
        series.set(4, 18);
        series.set(5, 20);
        series.set(6, 22);
        lineModel.addSeries(series);
        lineModel.setTitle("Temperature Trend");
        lineModel.setLegendPosition("e");
        lineModel.setShowPointLabels(true);
        logger.debug("Line model created successfully");
    }

    public BarChartModel getBarModel() {
        return barModel;
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public LineChartModel getLineModel() {
        return lineModel;
    }
} 

package com.example.yajunbai.bmi;

public class BMIModel {
    private double weight;
    private double height;

    public BMIModel(String w, String h) {
        this.weight = Double.parseDouble(w);
        this.height = Double.parseDouble(h);
    }

    public String getBMI() {
        double bmi =  this.weight/ (this.height * this.height);
        String result = String.format("%.1f", bmi);
        return result;
    }

    public String toPound() {
        double pound = (weight / 0.454);
        String result = String.format("%.1f", pound);
        return result;
    }


    public String toFeetInch() {
        String ret;
        double x = height * 3.2804; // 6.232
        int feet = (int) Math.floor(x); // 6
        int inch = (int) ((x - feet) * 12); // 10.0732

        ret = String.format("%d'%d\"", feet, inch);// 6'10"
        return ret;
    }

    public static void main(String[] args) {
        BMIModel myModel = new BMIModel("100","1.8");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("45","1.35");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("45", "1.78");
        System.out.println(myModel.toFeetInch());

    }
}


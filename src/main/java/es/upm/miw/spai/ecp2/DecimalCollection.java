package es.upm.miw.spai.ecp2;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {
    private List<Double> collection;

    
    public DecimalCollection() {
        this.collection = new ArrayList<Double>();
    } 

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        double sum = 0;
        for (double item : this.collection) {
            sum += item;
        }
        return sum;
    }

    public double higher() {
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher)
                higher = item;
        }
        return higher;
    }
    
    public double menor() {
        double menor = this.collection.get(0);
        for (double value : this.collection) {
            if (value < menor)
                menor = value;
        }
        return menor;
    }
    
    public double multiplication() {
        double multiplication = 1;
        for (double item : this.collection) {
        	multiplication *= item;
        }
        return multiplication;
    }

}

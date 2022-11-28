package com.walking.counterAggregation;

public class CounterService {
    private Counter[] counters;

    public CounterService(Counter ...counter) {
        this.counters = counter;
    }

    public Counter[] getCounters() {
        return counters;
    }

    void getNamesOfCounters() {
        for (Counter counter : counters) {
            System.out.println(counter.getNAME());
        }
    }

    void getValueOfCounter(Counter counter) {
        System.out.println(counter.getValue() + " " + counter.getUNIT());
    }

    void setValueOfCounter(Counter counter, int increase) {
        counter.setValue(counter.getValue() + increase);
    }

    void resetValueOfCounter(Counter counter) {
        counter.setValue(0);
    }
}

package com.walking.counterAggregation.service;

import com.walking.counterAggregation.model.Counter;

public class CounterService {
    private Counter[] counters;

    public CounterService(Counter ...counter) {

        this.counters = counter;
    }

    public Counter[] getCounters() {
        return counters;
    }

    public Counter getCounterByName(String name) {
        for (Counter counter : counters) {
            if (counter.getName().equals(name)) {
                return counter;
            }
        }
        return null;
    }


    public void getCounterValue(Counter counter) {

        System.out.println(counter.getValue() + " " + counter.getUnit());
    }

    public void increaseCounterValue(Counter counter, int increase) {

        counter.setValue(counter.getValue() + increase);
    }
    public void decreaseCounterValue(Counter counter, int increase) {

        counter.setValue(counter.getValue() - increase);
    }

    public void resetCounterValue(Counter counter) {

        counter.setValue(0);
    }

    public Counter[] addCounter(Counter counter) {
        int newArrayLength = counters.length + 1;

        Counter[] newCounters = new Counter[newArrayLength];
        newCounters[counters.length] = counter;

        counters = copyArray(counters, newCounters);
        return counters;
    }

    private Counter[] copyArray(Counter[] oldArray, Counter[] newArray) {
        System.arraycopy(oldArray, 0,newArray, 0, oldArray.length);
        return newArray;
    }
}

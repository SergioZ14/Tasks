package com.walking.counterAggregation;

public class Main {
    public static void main(String[] args) {
        Counter gas = new Counter("Gas", "cubic meter", 233);
        Counter hotWater = new Counter("Hot water", "cubic meter", 2);
        Counter coldWater = new Counter("Cold water", "cubic meter", 5);

        CounterService counterService = new CounterService(gas, hotWater, coldWater);

        counterService.getNamesOfCounters();
        counterService.getValueOfCounter(gas);
        counterService.getValueOfCounter(hotWater);
        counterService.getValueOfCounter(coldWater);
        counterService.setValueOfCounter(hotWater, 1);
        counterService.resetValueOfCounter(coldWater);
        counterService.getValueOfCounter(hotWater);
        counterService.getValueOfCounter(coldWater);
        getAllCounters(counterService);

    }
        private static void getAllCounters(CounterService counterService) {
        for (Counter counter : counterService.getCounters()) {
            System.out.println(counter.getNAME() + ": " + counter.getValue() + " " + counter.getUNIT());
        }
    }

}

package com.walking.counterAggregation;

import com.walking.counterAggregation.model.Counter;
import com.walking.counterAggregation.service.CounterService;

public class Main {
    public static void main(String[] args) {
        Counter gas = new Counter("Gas", "cubic meter");
        Counter hotWater = new Counter("Hot water", "cubic meter");
        Counter coldWater = new Counter("Cold water", "cubic meter");
        Counter electricity = new Counter("Electricity", "kilowatt per hour");

        CounterService counterService = new CounterService(gas, hotWater, coldWater);

        counterService.increaseCounterValue(gas, 7);
        counterService.increaseCounterValue(hotWater, 2);
        counterService.increaseCounterValue(coldWater, 5);
        counterService.getCounterValue(gas);
        counterService.getCounterValue(hotWater);
        counterService.getCounterValue(coldWater);
        counterService.resetCounterValue(coldWater);
        counterService.addCounter(electricity);
        counterService.increaseCounterValue(electricity, 10);
        counterService.getCounterValue(electricity);

        getAllCounters(counterService);

    }
        private static void getAllCounters(CounterService counterService) {
        for (Counter counter : counterService.getCounters()) {
            System.out.println(counter.getName() + ": " + counter.getValue() + " " + counter.getUnit());
        }
    }

}

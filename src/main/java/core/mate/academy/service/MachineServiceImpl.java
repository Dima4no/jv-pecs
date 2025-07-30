package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> result = new ArrayList<>();
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozer = new BulldozerProducer();
            result = bulldozer.get();
        } else if (type == Excavator.class) {
            ExcavatorProducer excavator = new ExcavatorProducer();
            result = excavator.get();
        } else if (type == Truck.class) {
            TruckProducer truck = new TruckProducer();
            result = truck.get();
        }
        return result;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}

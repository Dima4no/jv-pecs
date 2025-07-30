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
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<? extends Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> result = new ArrayList<>();
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
    public void fill(List<? super Machine> machines, T value) {

    }

    @Override
    public void startWorking(List<? extends Machine> machines) {

    }
}

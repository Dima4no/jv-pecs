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
    public List<T> getAll(Class<? extends T> type) {
        List<T> result = new ArrayList<>();
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozer = new BulldozerProducer();
            result = (List<T>) bulldozer.get();
        } else if (type == Excavator.class) {
            ExcavatorProducer excavator = new ExcavatorProducer();
            result = (List<T>)excavator.get();
        } else if (type == Truck.class) {
            TruckProducer truck = new TruckProducer();
            result = (List<T>)truck.get();
        }
        return result;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}

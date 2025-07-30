package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;

import java.util.List;
import java.util.ArrayList;

public class ExcavatorProducer implements MachineProducer<Machine> {

    @Override
    public List<Machine> get() {
        List<Machine> excavators = new ArrayList<>();
        excavators.add(new Excavator());
        excavators.add(new Excavator());
        return excavators;
    }
}

package com.github.rmgrimm.apifirst.api;

import com.github.rmgrimm.apifirst.model.Temperature;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TemperatureApiImpl implements TemperatureApiDelegate {
    @Override
    public List<Temperature> temperatureGet() {
        return Collections.singletonList(
                new Temperature((long) (Math.random() * 212.0), Temperature.UnitEnum.FAHRENHEIT)
        );
    }
}

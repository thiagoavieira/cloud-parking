package one.innovation.digital.cloudparking.service;

import one.innovation.digital.cloudparking.model.Parking;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ParkingService {

    private static final Map<String, Parking> parkingMap = new HashMap<>();

    static {
        var id = getUUID();
        Parking parking = new Parking(id, "FUR-4321", "MG", "HB20", "BRANCO");
        parkingMap.put(id, parking);
    }

    public List<Parking> findAll(){
        return new ArrayList<>(parkingMap.values());
    }

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}

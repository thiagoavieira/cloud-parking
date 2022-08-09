package one.innovation.digital.cloudparking.service;

import one.innovation.digital.cloudparking.model.Parking;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class ParkingService {

    private static final Map<String, Parking> parkingMap = new HashMap<>();

    static {
        var id = getUUID();
        var id1 = getUUID();
        Parking parking = new Parking(id, "FUR-4321", "MG", "HB20", "BRANCO");
        Parking parking1 = new Parking(id1, "TBK-1234", "SP", "VW GOL", "VERMELHO");
        parkingMap.put(id, parking);
        parkingMap.put(id1, parking1);
    }

    public List<Parking> findAll(){
        return new ArrayList<>(parkingMap.values());
    }

    public Parking findById(String id){
        return parkingMap.get(id);
    }

    public Parking create(Parking parkingCreate){
        String uuid = getUUID();
        parkingCreate.setId(uuid);
        parkingCreate.setEntryDate(LocalDateTime.now());
        parkingMap.put(uuid, parkingCreate);

        return parkingCreate;
    }

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}

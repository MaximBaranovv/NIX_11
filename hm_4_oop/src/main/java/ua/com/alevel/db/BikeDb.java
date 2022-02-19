package ua.com.alevel.db;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomStringUtils;
import ua.com.alevel.entity.Bike;

public class BikeDb {
    int count = 0;
    private int brief = 0;
    private Bike[] bikes = new Bike[0];
    private static BikeDb instance;
    public static BikeDb getInstance(){
        if( instance == null){
            instance = new BikeDb();
        }
        return instance;
    }

    public void create(Bike bike){
        bike.setId(generateId());
        Bike[] briefBikes = new Bike[bikes.length + 1];
        for (int i = 0; i < bikes.length; i++) {
            briefBikes[i] = bikes[i];
        }
        briefBikes[briefBikes.length - 1] = bike;
        bikes = briefBikes;

    }
    public void update(Bike bike){
        for (int i = 0; i < bikes.length; i++) {
            if(bikes[i].getId().equals(bike.getId())){
                bikes[i] = bike;
                break;
            }
        }
    }
    public void delete(String id){
        count = 0;
        for (int i = 0; i < bikes.length; i++) {
            if (bikes[i].getId().equals(id))
                count++;
        }
        if (count==1) {
            for (int i = 0; i < bikes.length; i++) {
                if (bikes[i].getId().equals(id))
                    bikes = ArrayUtils.removeElement(bikes, bikes[i]);
            }
        }
    }

    public Bike findById (String id){
        count = 0;
        brief = 0;

        for (int i = 0; i < bikes.length; i++) {
            if (bikes[i].getId().equals(id)){
                brief = i;
                count++;
            }
        }
        if( count == 0){
            return null;
        }
        else {
            return bikes[brief];
        }
    }

    public Bike[] findAll(){
        if(bikes.length == 0){
            return null;
        }
        return bikes;
    }

    private String generateId(){
        String id = RandomStringUtils.randomAlphabetic(10);
        for (int i = 0; i < bikes.length; i++) {
            if(bikes[i].getId().equals(id)){
                return generateId();
            }
        }
        return id;
    }

}
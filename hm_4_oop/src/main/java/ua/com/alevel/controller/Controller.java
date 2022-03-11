package ua.com.alevel.controller;

import org.apache.commons.lang3.EnumUtils;
import ua.com.alevel.entity.Bike;
import ua.com.alevel.entity.BikeType;
import ua.com.alevel.service.BikeService;
import ua.com.alevel.service.impl.BikeServiceImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
    private static final BikeService bikeService = new BikeServiceImpl();
    public static void runProgram() {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            navigation();
            String line ;
            while (true) {

                line  = reader.readLine();
                switch (line) {
                    case "1":
                        create(reader);
                        break;
                    case "2":
                        update(reader);
                        break;
                    case "3":
                        delete(reader);
                        break;
                    case "4":
                        findById(reader);
                        break;
                    case "5":
                        findAll(reader);
                        break;
                    case "6":
                        System.exit(0);
                        break;
                }
                navigation();
            }
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }

    private static void navigation() {
        System.out.println("if you want to create a bike, please enter 1");
        System.out.println("if you want to update a bike, please enter 2");
        System.out.println("if you want to delete a bike, please enter 3");
        System.out.println("if you want to find a bike by id, please enter 4");
        System.out.println("if you want to see all bikes, please enter 5");
        System.out.println("if you want to exit, please enter 6");

        System.out.print("-->");
    }
    private static void create(BufferedReader reader) throws IOException {
        System.out.println("Enter bike name");
        System.out.print("-->");
        String name  =reader.readLine();
        System.out.println("Enter bike colour");
        System.out.print("-->");
        String colour = reader.readLine();
        System.out.println("Enter bike type (XC, Trail, Enduro, Downhill)");
        System.out.print("-->");
        String type = reader.readLine();
        if(!EnumUtils.isValidEnum(BikeType.class, type)){
            System.out.println("Enter correct type of a bike!");
            System.out.println();
            return;
        }
        else {
            BikeType bikeType = BikeType.valueOf(type);
            Bike bike = new Bike();
            bike.setName(name);
            bike.setColour(colour);
            bike.setBikeType(bikeType);
            bikeService.create(bike);
            System.out.println("Bike has been successfully added!");
            System.out.println();
        }

    }
    private static void update(BufferedReader reader) throws IOException {
        if (bikeService.findAll()==null){
            System.out.println("There is no bikes in memory to update!");
            System.out.println();
        }
        else {
            System.out.println("Enter id");
            System.out.print("-->");
            String id = reader.readLine();
            if (bikeService.findById(id) == null) {
                System.out.println("Enter correct id of the bike!");
                System.out.println();
                return;
            }
            System.out.println("Enter bike name");
            System.out.print("-->");
            String name = reader.readLine();
            System.out.println("Enter bike colour");
            System.out.print("-->");
            String colour = reader.readLine();
            System.out.println("Enter bike type (XC, Trail, Enduro, Downhill)");
            System.out.print("-->");
            String type = reader.readLine();
            if(EnumUtils.isValidEnum(BikeType.class, type)){
                BikeType bikeType = BikeType.valueOf(type);
                Bike bike = new Bike();
                bike.setName(name);
                bike.setColour(colour);
                bike.setBikeType(bikeType);
                bike.setId(id);
                bikeService.update(bike);
                System.out.println("Bike has been successfully updated!");
                System.out.println();
            }
            else {
                System.out.println("Enter correct type of a bike!");
                System.out.println();
                return;
            }


        }

    }

    private static void delete(BufferedReader reader) throws IOException {
        if (bikeService.findAll()==null){
            System.out.println("There is no bikes in memory to delete!");
            System.out.println();
        }
        else {
            System.out.println("Enter bike id");
            System.out.print("-->");
            String id = reader.readLine();
            if (bikeService.findById(id) == null) {
                System.out.println("There is no such bike here");
                System.out.println();
                return;
            }

                bikeService.delete(id);
                System.out.println("Bike has been successfully deleted!");
                System.out.println();

        }

    }
    private static void findById(BufferedReader reader) throws IOException {
        if (bikeService.findAll()==null){
            System.out.println("There is no bikes in memory to find!");
            System.out.println();
        }
        else {
            System.out.println("Please, enter id");
            System.out.print("-->");
            String id = reader.readLine();
            if(bikeService.findById(id)==null) {
                System.out.println("there is no such bike here");
                System.out.println();
                return;
            }

                Bike bike = bikeService.findById(id);
                System.out.println("bike = " + bike);
                System.out.println();


        }

    }
    private static void findAll(BufferedReader reader) throws IOException {
        Bike[] bikes = bikeService.findAll();
        if (bikeService.findAll()==null) {
            System.out.println("Add bikes at first!");
            System.out.println();
        } else {
            for (int i = 0; i < bikes.length; i++) {
                System.out.println(bikes[i]);
                System.out.println();
            }
        }
    }
}

package org.example;

import org.example.swagger2java.api.PetApi;
import org.example.swagger2java.model.Pet;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.example.swagger2java.model.Pet.StatusEnum.AVAILABLE;

public class Main {
    public static void main(String[] args) {
        final PetApi api = new PetApi();
        final List<Pet> petsByStatus = api.findPetsByStatus(singletonList(AVAILABLE.getValue()));
        petsByStatus.forEach(System.out::println);
    }
}
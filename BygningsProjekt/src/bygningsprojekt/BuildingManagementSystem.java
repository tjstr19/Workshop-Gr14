/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bygningsprojekt;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Tjelle Lenovo V110
 */
public class BuildingManagementSystem {

    private ArrayList<Building> buildings;

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public BuildingManagementSystem() {
        this.buildings = new ArrayList<>();
    }

    public UUID addBuildings(String name) {
        Building temp = new Building(name);
        buildings.add(temp);
        buildings.add(temp);
        return temp.getId();
    }

    public void removeBuilding(UUID id) {
        List<Building> toRemove = new ArrayList<>();
        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i).getId() == id) {
                toRemove.add(buildings.get(i));
            }
        }
        buildings.removeAll(toRemove);
    }
}

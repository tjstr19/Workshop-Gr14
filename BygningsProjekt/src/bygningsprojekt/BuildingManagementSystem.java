/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bygningsprojekt;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author Tjelle Lenovo V110
 */
public class BuildingManagementSystem{

    private List<Building> buildings;

    public List<Building> getBuildings() {
        return buildings;
    }

    public UUID addBuildings(String name) {
        this.buildings = buildings;
    
    }
    public void removeBuilding(UUID id){
        
    }

}


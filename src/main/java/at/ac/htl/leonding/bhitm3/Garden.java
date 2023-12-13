package at.ac.htl.leonding.bhitm3;

import java.util.LinkedList;
import java.util.List;

public class Garden {

    private List plants = new LinkedList<>();

    public Garden() {

    }

    public List getPlants() {
        return plants;
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }
    
}

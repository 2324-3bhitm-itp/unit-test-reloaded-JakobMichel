package at.ac.htl.leonding.bhitm3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PlantTest {
    
    Plant plant;
    @Before
    public void setup() {
        
    }
    @Test
    public void given_new_plant_test_constructor_and_getter() {
        Plant plant = new Plant();
        assertEquals(null, plant.getName());
        assertEquals(null, plant.getType());
        assertEquals(0, plant.getWaterDemandIndicator());
        
    }
}

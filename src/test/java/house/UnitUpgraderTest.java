package house;

import house.PenthouseSuite;
import house.Studio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UnitUpgraderTest {
    @Test
    public void testUpgraderIncreasesSquareFootageOfPenthouse() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1500);
        penthouse.upgrade();

        assertEquals(1540, penthouse.squareFootage);
    }

    @Test
    public void testUpgraderAddsBedroomToApartment() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.upgrade();

        assertEquals(5, penthouse.numberOfBedrooms);
    }

    @Test
    public void testUpgraderIncreasesSquareFootageOfStudio() {
        Studio studio = new Studio();
        studio.setSquareFootage(550);
        studio.upgrade();

        assertEquals(590, studio.squareFootage);
    }

    @Test
    public void testUpgraderDoesntAddBedroomToStudios() {
        Studio studio = new Studio();
        studio.upgrade();

        assertEquals(0, studio.numberOfBedrooms);
    }
}

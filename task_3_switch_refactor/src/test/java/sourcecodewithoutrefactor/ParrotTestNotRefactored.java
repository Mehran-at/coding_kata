package sourcecodewithoutrefactor;

import com.kingcode.sourcecodewithoutrefactor.ParrotNotRefactored;
import com.kingcode.sourcecodewithoutrefactor.ParrotTypeEnumNotRefactored;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParrotTestNotRefactored {

    @Test
    public void getSpeedOfEuropeanParrot() {
        ParrotNotRefactored parrot = new ParrotNotRefactored(ParrotTypeEnumNotRefactored.EUROPEAN, 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        ParrotNotRefactored parrot = new ParrotNotRefactored(ParrotTypeEnumNotRefactored.AFRICAN, 1, 0, false);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        ParrotNotRefactored parrot = new ParrotNotRefactored(ParrotTypeEnumNotRefactored.AFRICAN, 2, 0, false);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        ParrotNotRefactored parrot = new ParrotNotRefactored(ParrotTypeEnumNotRefactored.AFRICAN, 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        ParrotNotRefactored parrot = new ParrotNotRefactored(ParrotTypeEnumNotRefactored.NORWEGIAN_BLUE, 0, 1.5, true);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        ParrotNotRefactored parrot = new ParrotNotRefactored(ParrotTypeEnumNotRefactored.NORWEGIAN_BLUE, 0, 1.5, false);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        ParrotNotRefactored parrot = new ParrotNotRefactored(ParrotTypeEnumNotRefactored.NORWEGIAN_BLUE, 0, 4, false);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }
}

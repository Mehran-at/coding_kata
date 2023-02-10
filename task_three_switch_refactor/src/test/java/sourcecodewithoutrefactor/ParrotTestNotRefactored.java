package sourcecodewithoutrefactor;

import com.kingcode.ParrotImpl;
import com.kingcode.ParrotTypeEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParrotTestNotRefactored {

    @Test
    public void getSpeedOfEuropeanParrot() {
        ParrotImpl parrot = new ParrotImpl(ParrotTypeEnum.EUROPEAN, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        ParrotImpl parrot = new ParrotImpl(ParrotTypeEnum.AFRICAN, 0, false);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        ParrotImpl parrot = new ParrotImpl(ParrotTypeEnum.AFRICAN, 0, false);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        ParrotImpl parrot = new ParrotImpl(ParrotTypeEnum.AFRICAN, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        ParrotImpl parrot = new ParrotImpl(ParrotTypeEnum.NORWEGIAN_BLUE, 1.5, true);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        ParrotImpl parrot = new ParrotImpl(ParrotTypeEnum.NORWEGIAN_BLUE, 1.5, false);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        ParrotImpl parrot = new ParrotImpl(ParrotTypeEnum.NORWEGIAN_BLUE, 4, false);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }
}
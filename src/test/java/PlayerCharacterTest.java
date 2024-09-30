import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {
    @Test
    public void getX_return0 (){
        //GIVEN

        //WHEN
        int actual = PlayerCharacter.getX();

        //THEN
        assertEquals(0, actual);
    }
}

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
    @Test
    public void getY_return0 (){
        //GIVEN

        //WHEN
        int actual = PlayerCharacter.getY();

        //THEN
        assertEquals(0, actual);
    }

    @Test
    public void move_Test_whenW_Yequals1(){
        //given
        String input = "W";

        //when
        int actual = PlayerCharacter.move(input);

        //then
        assertEquals(1,actual);

    }
}


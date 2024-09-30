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
    @Test
    public void move_Test_whenD_Xequals1(){
        //given
        String input = "D";

        //when
        int actual = PlayerCharacter.move(input);

        //then
        assertEquals(1,actual);
    }
    @Test
    public void move_Test_whenA_XequalsMinus1(){
        //given
        String input = "A";

        //when
        int actual = PlayerCharacter.move(input);

        //then
        assertEquals(-1,actual);
    }

    @Test
    public void move_Test_whenS_YequalsMinus1(){
        //given
        String input = "S";

        //when
        int actual = PlayerCharacter.move(input);

        //then
        assertEquals(-1,actual);
    }


}


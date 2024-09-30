public class PlayerCharacter {

    public static int getX(){
       return 0;
    }
    public static int getY(){
        return 0;
    }

    public static int move(String input){
        if(input == "W"){
            return 1;
        } else {
            return 0;
        }
    }

}

public class PlayerCharacter {
    static int x = 0;
    static int y = 0;

    public static int getX(){
       return x;
    }
    public static int getY(){
        return y;
    }

    public static int move(String input){
        if(input == "W"){
            return y+1;
        } else if (input == "D") {
            return x+1;
        } else if (input == "A"){
            return x-1;
        } else if (input == "S"){
            return y-1;
        }
        return 0;
    }

}

public class Wall {

    public String getDirection() {
        return direction;
    }

    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }
    public void create(){
        System.out.println(this.direction);
    }

}

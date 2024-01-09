public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof1;
    private Triangle roof2;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof1 = new Triangle();
        roof2 = new Triangle();
        sun = new Circle();
        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();

            window.changeColor("black");
            window.moveHorizontal(-110);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();


            roof1.changeColor("brown");
            roof1.changeSize(60, 180);
            roof1.moveHorizontal(20);
            roof1.moveVertical(-100);
            roof1.makeVisible();

            roof2.changeColor("black");
            roof2.changeSize(10,120);
            roof2.moveHorizontal(20);
            roof2.moveVertical(-100);
            roof2.makeVisible();

            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof1.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof1.changeColor("black");
        sun.changeColor("yellow");
    }
}

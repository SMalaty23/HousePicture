public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof1;
    private Triangle roof2;

    private Square wall2;

    private Square wall3;
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
        wall2 = new Square();
        wall3 = new Square();
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

            wall2.moveHorizontal(-110);
            wall2.moveVertical(10);
            wall2.changeSize(130);
            wall2.makeVisible();

            wall3.moveHorizontal(-110);
            wall3.moveVertical(-50);
            wall3.changeSize(175);
            wall3.makeVisible();


            window.changeColor("black");
            window.moveHorizontal(-110);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeInvisible();


            roof1.changeColor("brown");
            roof1.changeSize(60, 180);
            roof1.moveHorizontal(35);
            roof1.moveVertical(-60);
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
            sun.makeInvisible();
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

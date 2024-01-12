public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof1;
    private Triangle roof2;
    private Square wall2;
    private Square wall3;
    private Square wall4;
    private Square wall5;
    private Square wall6;
    private Square wall7;
    private Square wall8;
    private Square wall9;
    private Square wall10;
    private Square wall11;
    private Square wall12;
    private Square wall13;
    private Square wall14;
    private Square wall15;
    private Square wall16;
    private Square wall17;
    private Triangle roof3;
    private Triangle roof4;
    private Triangle roof5;

    private Square window2;
    private Square window3;

    private Circle doorHandle;

    private Circle sun;
    private Square grass;
    private Square window4;
    private Square window5;
    private Square window6;
    private Square window7;

    private Square windowOutline1;
    private Square windowOutline2;
    private Square window8;
    private Square window9;

    private Square window10;
    private Square window11;
    private Person person;
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
        wall4 = new Square();
        wall5 = new Square();
        wall6 = new Square();
        wall7 = new Square();
        wall8 = new Square();
        wall9 = new Square();
        wall10 = new Square();
        wall11 = new Square();
        wall12 = new Square();
        wall13 = new Square();
        wall14 = new Square();
        wall15 = new Square();
        wall16 = new Square();
        wall17 = new Square();
        roof3 = new Triangle();
        roof4 = new Triangle();
        roof5 = new Triangle();
        window2 = new Square();
        window3 = new Square();
        doorHandle = new Circle();
        grass = new Square();
        window4 = new Square();
        window5 = new Square();
        window6 = new Square();
        window7 = new Square();
        windowOutline1 = new Square();
        windowOutline2 = new Square();
        window8 = new Square();
        window9 = new Square();
        window10 = new Square();
        window11 = new Square();
        person = new Person();

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
            grass.changeColor("green");
            grass.moveHorizontal(-260);
            grass.moveVertical(100);
            grass.changeSize(200);
            grass.makeVisible();

            wall.moveHorizontal(-150);
            wall.moveVertical(60);
            wall.changeSize(120);
            wall.makeVisible();

            wall6.moveHorizontal(10);
            wall6.moveVertical(60);
            wall6.changeSize(130);
            wall6.makeVisible();

            wall7.moveHorizontal(55);
            wall7.moveVertical(60);
            wall7.changeSize(130);
            wall7.makeVisible();

            roof1.changeColor("brown");
            roof1.changeSize(80, 320);
            roof1.moveHorizontal(150);
            roof1.moveVertical(-30);
            roof1.makeVisible();

            wall2.moveHorizontal(-90);
            wall2.moveVertical(-70);
            wall2.changeSize(130);
            wall2.makeVisible();


            wall3.moveHorizontal(-110);
            wall3.moveVertical(70);
            wall3.changeSize(120);
            wall3.makeVisible();

            wall4.moveHorizontal(-260);
            wall4.moveVertical(60);
            wall4.changeSize(120);
            wall4.makeVisible();

            wall5.moveHorizontal(40);
            wall5.moveVertical(-70);
            wall5.changeSize(130);
            wall5.makeVisible();

            wall8.changeColor("white");
            wall8.moveHorizontal(10);
            wall8.moveVertical(75);
            wall8.changeSize(110);
            wall8.makeVisible();

            wall9.changeColor("white");
            wall9.moveHorizontal(-30);
            wall9.moveVertical(75);
            wall9.changeSize(110);
            wall9.makeVisible();

            wall10.changeColor("white");
            wall10.moveHorizontal(-150);
            wall10.moveVertical(70);
            wall10.changeSize(45);
            wall10.makeVisible();

            wall11.changeColor("white");
            wall11.moveHorizontal(-150);
            wall11.moveVertical(90);
            wall11.changeSize(45);
            wall11.makeVisible();

            wall12.changeColor("white");
            wall12.moveHorizontal(-150);
            wall12.moveVertical(120);
            wall12.changeSize(45);
            wall12.makeVisible();


            window.changeColor("black");
            window.moveHorizontal(-250);
            window.moveVertical(70);
            window.changeSize(45);
            window.makeVisible();

            wall13.changeColor("white");
            wall13.moveHorizontal(-247);
            wall13.moveVertical(75);
            wall13.changeSize(17);
            wall13.makeVisible();

            wall14.changeColor("white");
            wall14.moveHorizontal(-227);
            wall14.moveVertical(75);
            wall14.changeSize(17);
            wall14.makeVisible();

            wall15.changeColor("white");
            wall15.moveHorizontal(-227);
            wall15.moveVertical(95);
            wall15.changeSize(17);
            wall15.makeVisible();

            wall16.changeColor("white");
            wall16.moveHorizontal(-247);
            wall16.moveVertical(95);
            wall16.changeSize(17);
            wall16.makeVisible();

            wall17.changeColor("brown");
            wall17.moveHorizontal(-170);
            wall17.moveVertical(-21);
            wall17.changeSize(81);
            wall17.makeVisible();

            roof2.changeColor("brown");
            roof2.changeSize(95,214);
            roof2.moveHorizontal(-80);
            roof2.moveVertical(-55);
            roof2.makeVisible();

            roof3.changeColor("brown");
            roof3.changeSize(95,300);
            roof3.moveHorizontal(140);
            roof3.moveVertical(-175);
            roof3.makeVisible();

            roof4.changeColor("white");
            roof4.changeSize(75,220);
            roof4.moveHorizontal(140);
            roof4.moveVertical(-160);
            roof4.makeVisible();

            roof5.changeColor("grey");
            roof5.changeSize(65,220);
            roof5.moveHorizontal(140);
            roof5.moveVertical(-150);
            roof5.makeVisible();


            windowOutline2.changeColor("white");
            windowOutline2.moveHorizontal(70);
            windowOutline2.moveVertical(-50);
            windowOutline2.changeSize(85);
            windowOutline2.makeVisible();

            window2.changeColor("black");
            window2.moveHorizontal(75);
            window2.moveVertical(-45);
            window2.changeSize(75);
            window2.makeVisible();

            windowOutline1.changeColor("white");
            windowOutline1.moveHorizontal(-55);
            windowOutline1.moveVertical(-50);
            windowOutline1.changeSize(85);
            windowOutline1.makeVisible();

            window3.changeColor("black");
            window3.moveHorizontal(-50);
            window3.moveVertical(-45);
            window3.changeSize(75);
            window3.makeVisible();

            doorHandle.changeColor("Black");
            doorHandle.moveHorizontal(-70);
            doorHandle.moveVertical(140);
            doorHandle.changeSize(12);
            doorHandle.makeVisible();

            window4.changeColor("white");
            window4.moveHorizontal(-45);
            window4.moveVertical(-40);
            window4.changeSize(30);
            window4.makeVisible();

            window5.changeColor("white");
            window5.moveHorizontal(-45);
            window5.moveVertical(-3);
            window5.changeSize(30);
            window5.makeVisible();

            window6.changeColor("white");
            window6.moveHorizontal(-9);
            window6.moveVertical(-3);
            window6.changeSize(30);
            window6.makeVisible();

            window7.changeColor("white");
            window7.moveHorizontal(-9);
            window7.moveVertical(-40);
            window7.changeSize(30);
            window7.makeVisible();

            window8.changeColor("white");
            window8.moveHorizontal(80);
            window8.moveVertical(-40);
            window8.changeSize(30);
            window8.makeVisible();

            window9.changeColor("white");
            window9.moveHorizontal(80);
            window9.moveVertical(-3);
            window9.changeSize(30);
            window9.makeVisible();

            window10.changeColor("white");
            window10.moveHorizontal(115);
            window10.moveVertical(-3);
            window10.changeSize(30);
            window10.makeVisible();

            window11.changeColor("white");
            window11.moveHorizontal(115);
            window11.moveVertical(-40);
            window11.changeSize(30);
            window11.makeVisible();

            person.changeColor("brown");
            person.moveHorizontal(-170);
            person.moveVertical(110);
            person.changeSize(100,50);
            person.makeVisible();


            sun.changeColor("yellow");
            sun.moveHorizontal(270);
            sun.moveVertical(-50);
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
        wall.changeColor("grey");
        window.changeColor("black");
        roof1.changeColor("black");
        sun.changeColor("yellow");
    }
}

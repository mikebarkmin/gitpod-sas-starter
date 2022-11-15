import sas.*;

class MyProgram {

  private View ansicht;
  private Rectangle rechteck;

  public MyProgram() {
    ansicht = new View(600, 600, "My Program");
    rechteck = new Rectangle(10, 10, 480, 390);

    while(true) {
      rechteck.turn(1);
      ansicht.wait(100);
    }
  }
}

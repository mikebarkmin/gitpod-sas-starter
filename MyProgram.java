import java.awt.Color;

import sas.*;

class MyProgram {

  private View ansicht;
  private Rectangle rechteck;

  public MyProgram() {
    ansicht = new View(300, 300, "My Program");
    rechteck = new Rectangle(10, 10, 180, 190);

    while(true) {
      rechteck.turn(1);
      ansicht.wait(100);

      rechteck.setColor(Color.ORANGE);

      if(ansicht.keyUpPressed()) {
        rechteck.setColor(Color.GRAY);
      } else if (ansicht.keyDownPressed()) {
        rechteck.setColor(Color.BLUE);
      }
    }
  }
}

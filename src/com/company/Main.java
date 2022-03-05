package com.company;

import less28.*;

public class Main {

    public static void main(String[] args) {

      Body body = new Body();

      SmallHead smallhead = new SmallHead();
      MediumHead mediumHead = new MediumHead();
      LargeHead largeHead = new LargeHead();

      Robot<SmallHead> robot = new Robot<SmallHead>(body,smallhead);
      Robot<LargeHead> robot1 = new Robot<LargeHead>(body,largeHead);

      robot.getHead().burn();
      robot1.getHead().turn();

      Robot robot2 = new Robot(body,mediumHead);
      robot2 = robot1;

      Leg leg = new Leg();

      Robot robot3 = new Robot(body,mediumHead);
    }
}

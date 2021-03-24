/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.snapshots;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.measures.AbsoluteAngle;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.snapshots.RobotSnapshot;
import net.virtualinfinity.atrobots.snapshots.SnapshotAdaptor;
import net.virtualinfinity.atrobots.snapshots.SnapshotVisitor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RobotSnapshotEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      robotSnapshot0.setTotalTies(1558);
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      boolean boolean0 = robotSnapshot0.equals((Object) robotSnapshot1);
      assertEquals(1558, robotSnapshot0.getTotalTies());
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      SnapshotAdaptor snapshotAdaptor0 = new SnapshotAdaptor();
      robotSnapshot0.visit((SnapshotVisitor) snapshotAdaptor0);
      assertEquals(false, robotSnapshot0.isOverburn());
  }

  @Test
  public void test2()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      robotSnapshot0.setId((-17));
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      boolean boolean0 = robotSnapshot0.equals((Object) robotSnapshot1);
      assertEquals(-17, robotSnapshot0.getId());
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      boolean boolean0 = robotSnapshot0.isOverburn();
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      String string0 = robotSnapshot0.getLastMessage();
      assertNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      robotSnapshot0.setTotalKills((-1703));
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      boolean boolean0 = robotSnapshot0.equals((Object) robotSnapshot1);
      assertEquals(-1703, robotSnapshot0.getTotalKills());
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      int int0 = robotSnapshot0.getRoundKills();
      assertEquals(0, int0);
  }

  @Test
  public void test7()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      robotSnapshot0.setTotalWins(1955);
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      boolean boolean0 = robotSnapshot0.equals((Object) robotSnapshot1);
      assertEquals(1955, robotSnapshot0.getTotalWins());
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      int int0 = robotSnapshot0.getTotalWins();
      assertEquals(0, int0);
  }

  @Test
  public void test9()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian((-1.0), (-1.0));
      robotSnapshot0.setHeading(absoluteAngle0);
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      boolean boolean0 = robotSnapshot0.equals((Object) robotSnapshot1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      int int0 = robotSnapshot0.getTotalTies();
      assertEquals(0, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      Temperature temperature0 = robotSnapshot0.getTemperature();
      assertNull(temperature0);
  }

  @Test
  public void test12()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      String string0 = robotSnapshot0.getName();
      assertNull(string0);
  }

  @Test
  public void test13()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      int int0 = robotSnapshot0.getTotalDeaths();
      assertEquals(0, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      robotSnapshot0.setOverburn(true);
      Temperature temperature0 = new Temperature((double) 1558);
      robotSnapshot0.setTemperature(temperature0);
      // Undeclared exception!
      try {
        robotSnapshot0.hashCode();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      robotSnapshot0.setRoundKills(38);
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      boolean boolean0 = robotSnapshot0.equals((Object) robotSnapshot1);
      assertEquals(38, robotSnapshot0.getRoundKills());
      assertEquals(false, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      int int0 = robotSnapshot0.getTotalKills();
      assertEquals(0, int0);
  }

  @Test
  public void test17()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      robotSnapshot0.setTotalDeaths(981);
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      boolean boolean0 = robotSnapshot0.equals((Object) robotSnapshot1);
      assertEquals(981, robotSnapshot0.getTotalDeaths());
      assertEquals(false, boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      double double0 = robotSnapshot0.getArmor();
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test19()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      AbsoluteAngle absoluteAngle0 = robotSnapshot0.getTurretHeading();
      assertNull(absoluteAngle0);
  }

  @Test
  public void test20()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      boolean boolean0 = robotSnapshot0.isActiveShield();
      assertEquals(false, boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      robotSnapshot0.setTurretHeading((AbsoluteAngle) null);
      assertEquals(false, robotSnapshot0.isDead());
  }

  @Test
  public void test22()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      int int0 = robotSnapshot0.getId();
      assertEquals(0, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      AbsoluteAngle absoluteAngle0 = robotSnapshot0.getHeading();
      assertNull(absoluteAngle0);
  }

  @Test
  public void test24()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      boolean boolean0 = robotSnapshot0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      boolean boolean0 = robotSnapshot0.equals((Object) "1s");
      assertEquals(false, boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      robotSnapshot0.setActiveShield(true);
      boolean boolean0 = robotSnapshot1.equals((Object) robotSnapshot0);
      assertEquals(true, robotSnapshot0.isActiveShield());
      assertEquals(false, boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      robotSnapshot0.setArmor(11.958031392554451);
      boolean boolean0 = robotSnapshot0.equals((Object) robotSnapshot1);
      assertEquals(11.958031392554451, robotSnapshot0.getArmor(), 0.01D);
      assertEquals(false, boolean0);
  }

  @Test
  public void test28()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      robotSnapshot0.setOverburn(true);
      boolean boolean0 = robotSnapshot0.equals((Object) robotSnapshot1);
      assertEquals(true, robotSnapshot0.isOverburn());
      assertEquals(false, boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian((-1.0), (-1.0));
      robotSnapshot0.setHeading(absoluteAngle0);
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      robotSnapshot1.setHeading(absoluteAngle0);
      robotSnapshot0.setLastMessage(" '+=zTI}owg)qH{");
      boolean boolean0 = robotSnapshot0.equals((Object) robotSnapshot1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test30()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian(11.958031392554451, 11.958031392554451);
      robotSnapshot0.setHeading(absoluteAngle0);
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      robotSnapshot1.setHeading(absoluteAngle0);
      robotSnapshot1.setLastMessage("GcW>_%U OyS");
      boolean boolean0 = robotSnapshot0.equals((Object) robotSnapshot1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test31()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian((-1.0), (-1.0));
      robotSnapshot0.setHeading(absoluteAngle0);
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      robotSnapshot1.setHeading(absoluteAngle0);
      robotSnapshot1.setName(" '+=zTI}owg)qH{");
      robotSnapshot1.setLastMessage(" '+=zTI}owg)qH{");
      robotSnapshot0.setLastMessage(" '+=zTI}owg)qH{");
      robotSnapshot0.setName(" '+=zTI}owg)qH{");
      // Undeclared exception!
      try {
        robotSnapshot0.equals((Object) robotSnapshot1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test32()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian(13.815711640767788, 13.815711640767788);
      robotSnapshot0.setHeading(absoluteAngle0);
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      robotSnapshot1.setHeading(absoluteAngle0);
      robotSnapshot0.setName("7");
      boolean boolean0 = robotSnapshot0.equals((Object) robotSnapshot1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian((-1.0), (-1.0));
      robotSnapshot0.setHeading(absoluteAngle0);
      Temperature temperature0 = new Temperature((-1.0));
      robotSnapshot0.setTemperature(temperature0);
      RobotSnapshot robotSnapshot1 = new RobotSnapshot();
      robotSnapshot1.setHeading(absoluteAngle0);
      robotSnapshot1.setName(" '+=zTI}owg)qH{");
      robotSnapshot1.setLastMessage(" '+=zTI}owg)qH{");
      robotSnapshot0.setLastMessage(" '+=zTI}owg)qH{");
      robotSnapshot0.setName(" '+=zTI}owg)qH{");
      boolean boolean0 = robotSnapshot0.equals((Object) robotSnapshot1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      Temperature temperature0 = Temperature.BASE_TEMPERATURE;
      robotSnapshot0.setTemperature(temperature0);
      robotSnapshot0.setArmor(114.96454885175427);
      // Undeclared exception!
      try {
        robotSnapshot0.hashCode();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test35()  throws Throwable  {
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      Temperature temperature0 = Temperature.BASE_TEMPERATURE;
      robotSnapshot0.setTemperature(temperature0);
      robotSnapshot0.setActiveShield(true);
      // Undeclared exception!
      try {
        robotSnapshot0.hashCode();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
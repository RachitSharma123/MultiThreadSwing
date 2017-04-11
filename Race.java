import java.awt.Color;
import java.util.Random;
import javax.swing.*;

public class Race implements Runnable 
{
String ThreadName;
JLabel l;
JPanel l1,l2,l3;
JFrame fr;
public Race()
{
    buildGUI();
}
public void run()
{
    if(Thread.currentThread().getName().equals("ObstacleA"))
    {
        runObstacleA();
}
     if(Thread.currentThread().getName().equals("ObstacleB"))
    {
        runObstacleB();
}
      if(Thread.currentThread().getName().equals("ObstacleC"))
    {
        runObstacleC();
}
}
public void runObstacleA()
{
Random ran=new Random();
int s= ran.nextInt(100);
for(int i=-10;i<400;i++){
l1.setBounds(i,s,40,40);
try{
Thread.sleep(5);
}
catch(Exception e)
{
    System.out.println(e);
}
}
runObstacleC();
}
public void runObstacleB()
{
Random ran=new Random();
int r = ran.nextInt(100);
for(int i=-10;i<400;i++){
l2.setBounds(i,r,40,40);
try{
Thread.sleep(11);
}
catch(Exception e)
{
    System.out.println(e);
}
}
runObstacleA();
}
public void runObstacleC()
{
Random ran=new Random();
int m= ran.nextInt(100);
for(int i=-10;i<400;i++){
l3.setBounds(i,m,40,40);
try{
Thread.sleep(10);
}
catch(Exception e)
{
    System.out.println(e);
}
}
runObstacleB();
}
public void buildGUI()
{
fr=new JFrame("RACE CARS");
fr.setVisible(true);
fr.setSize(400,200);
fr.setLayout(null);
l=new JLabel("");
l.setBounds(10,10,400,20);
fr.add(l);
l1=new JPanel();
l1.setSize(40,40);
l1.setBackground(Color.red);
l1.setBounds(10,40,20,20);
fr.add(l1);
l2=new JPanel();
l2.setSize(40,40);
l2.setBackground(Color.blue);
l2.setBounds(10,80,20,20);
fr.add(l2);
l3=new JPanel();
l3.setSize(40,40);
l3.setBackground(Color.black);
l3.setBounds(10,120,20,20);
fr.add(l3);

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Race y=new Race();
    Thread Obstacle1=new Thread(y);
    Thread Obstacle2=new Thread(y);
    Thread Obstacle3=new Thread(y);
    Obstacle1.setName("ObstacleA");
    Obstacle2.setName("ObstacleB");
    Obstacle3.setName("ObstacleC");
    Obstacle1.start();
    Obstacle2.start();
    Obstacle3.start();
    }
    
}

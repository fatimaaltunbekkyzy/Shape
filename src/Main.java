//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
NarrowAngle narrowAngle = new NarrowAngle(12,24);
RightAngle rightAngle = new RightAngle(21);
MineAngle mineAngle = new MineAngle(10,10,10);
Sguare sguare = new Sguare(22);
Shape[]shapes = {narrowAngle,rightAngle,mineAngle,sguare};
        for(Shape num : shapes){
            System.out.println("Периметр:"+num.getPerimeter());
        }
    }
}
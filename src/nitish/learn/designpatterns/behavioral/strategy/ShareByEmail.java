package nitish.learn.designpatterns.behavioral.strategy;

public class ShareByEmail implements CameraAppShareStrategy{
    @Override
    public void share() {
        System.out.println("Sharing picture via Email");
    }
}

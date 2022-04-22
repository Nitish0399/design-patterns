package nitish.learn.designpatterns.behavioral.strategy;

public class ShareBySocialMedia implements CameraAppShareStrategy{
    @Override
    public void share() {
        System.out.println("Sharing picture via Social Media");
    }
}

package nitish.learn.designpatterns.behavioral.strategy;

public abstract class PhoneCameraApp {

    CameraAppShareStrategy cameraAppShareStrategy;

    public void take() {
        System.out.println("Take a Picture");
    }

    public abstract void edit();

    public void save() {
        System.out.println("Save the Picture");
    }

    public void share() {
        cameraAppShareStrategy.share();
    }

    public void setCameraAppShareStrategy(CameraAppShareStrategy cameraAppShareStrategy) {
        this.cameraAppShareStrategy = cameraAppShareStrategy;
    }
}

package nitish.learn.designpatterns.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        PhoneCameraApp phoneCameraApp = new BasicCameraApp();

        CameraAppShareStrategy shareByEmail = new ShareByEmail();
        phoneCameraApp.setCameraAppShareStrategy(shareByEmail);

        phoneCameraApp.take();
        phoneCameraApp.edit();
        phoneCameraApp.save();
        phoneCameraApp.share();

        CameraAppShareStrategy shareBySocialMedia = new ShareBySocialMedia();
        phoneCameraApp.setCameraAppShareStrategy(shareBySocialMedia);

        phoneCameraApp.share();
    }
}

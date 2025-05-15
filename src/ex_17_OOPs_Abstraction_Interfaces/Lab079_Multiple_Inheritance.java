package ex_17_OOPs_Abstraction_Interfaces;

// Interfaces representing separate abilities
interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

// Smartphone class inherits multiple behaviors
class Smartphone implements Camera, MusicPlayer {
    @Override
    public void takePhoto() {
        System.out.println("Taking a high-resolution photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music through the speakers...");
    }

    void makeCall() {
        System.out.println("Making a phone call...");
    }
}
public class Lab079_Multiple_Inheritance {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.takePhoto();    // Camera functionality
        phone.playMusic();    // MusicPlayer functionality
        phone.makeCall();     // Own class method
    }
}

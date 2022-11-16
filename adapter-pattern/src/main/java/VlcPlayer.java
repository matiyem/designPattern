/*
    Create by Atiye Mousavi 
    Date: 11/6/2022
    Time: 3:04 PM
**/
public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}

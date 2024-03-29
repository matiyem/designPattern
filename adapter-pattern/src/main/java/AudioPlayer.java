/*
    Create by Atiye Mousavi 
    Date: 11/6/2022
    Time: 3:28 PM
**/
public class AudioPlayer implements MediaPlayer{

    MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaPlayer=new MediaAdapter(audioType);
            mediaPlayer.play(audioType,fileName);
        }
        else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}

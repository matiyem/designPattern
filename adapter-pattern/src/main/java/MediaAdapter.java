/*
    Create by Atiye Mousavi 
    Date: 11/6/2022
    Time: 3:06 PM
**/
public class MediaAdapter implements MediaPlayer{

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer=new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer=new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
       if (audioType.equalsIgnoreCase("vlc")){
           advanceMediaPlayer.playVlc(fileName);
       } else if (audioType.equalsIgnoreCase("mp4")) {
           advanceMediaPlayer.playMp4(fileName);

       }

    }
}

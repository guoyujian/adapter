package test.adapter;

/**
 * ¿Í»§¶Ë
 * @author guoyujian
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer player = new AudioPlayer();
		player.play("mp3", "Á¹Á¹.mp3");
		player.play("mp4", "Á¹Á¹.mp4");
		player.play("vlc", "Á¹Á¹.vlc");
	}

}

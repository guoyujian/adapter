package test.adapter;

/**
 * �ͻ���
 * @author guoyujian
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer player = new AudioPlayer();
		player.play("mp3", "����.mp3");
		player.play("mp4", "����.mp4");
		player.play("vlc", "����.vlc");
	}

}

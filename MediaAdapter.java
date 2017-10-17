package test.adapter;

/**
 * 适配器类，实现目标接口，并持有一个源接口的引用
 * @author guoyujian
 *
 */
public class MediaAdapter implements MediaPlayer {
	
	private AdvancedMediaPlayer player = null;
	public MediaAdapter(String type) {
		// TODO Auto-generated constructor stub
		if("mp4".equals(type)){
			player = new Mp4Player();
		} else if("vlc".equals(type)){
			player = new VlcPlayer();
		}
	}
	
	@Override
	public void play(String type, String filename) {
		// TODO Auto-generated method stub
		if("mp4".equals(type)){
			player.playMp4(filename);
		} else if("vlc".equals(type)){
			player.playVlc(filename);
		}
		
	}

}

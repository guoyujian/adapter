package test.adapter;

/**
 * 目标接口的实现类，客户调用的类
 * @author guoyujian
 *
 */
public class AudioPlayer implements MediaPlayer {
	
	private MediaAdapter adapter = null;
	@Override
	public void play(String type, String filename) {
		// TODO Auto-generated method stub
		if("mp3".equals(type)){
			//内置的对mp3文件的播放支持
			System.out.println("播放MP3文件"+filename);
		}else if("mp4".equals(type) || "vlc".equals(type)){
			adapter = new MediaAdapter(type);
			adapter.play(type, filename);
		}else {
			System.out.println("不支持的类型");
		}

	}

}

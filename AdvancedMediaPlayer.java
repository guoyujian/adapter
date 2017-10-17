package test.adapter;

/**
 * 源接口，Mp4Player,VlcPlayer都是被适配的类
 * @author guoyujian
 *
 */
public interface AdvancedMediaPlayer {
	public void playVlc(String filename);
	public void playMp4(String filename);
}

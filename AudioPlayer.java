package test.adapter;

/**
 * Ŀ��ӿڵ�ʵ���࣬�ͻ����õ���
 * @author guoyujian
 *
 */
public class AudioPlayer implements MediaPlayer {
	
	private MediaAdapter adapter = null;
	@Override
	public void play(String type, String filename) {
		// TODO Auto-generated method stub
		if("mp3".equals(type)){
			//���õĶ�mp3�ļ��Ĳ���֧��
			System.out.println("����MP3�ļ�"+filename);
		}else if("mp4".equals(type) || "vlc".equals(type)){
			adapter = new MediaAdapter(type);
			adapter.play(type, filename);
		}else {
			System.out.println("��֧�ֵ�����");
		}

	}

}

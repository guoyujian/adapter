package test.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
		// TODO Auto-generated method stub
	}

	@Override
	public void playMp4(String filename) {
		// TODO Auto-generated method stub
		System.out.println("²¥·ÅMP4ÎÄ¼þ"+filename);
	}

}

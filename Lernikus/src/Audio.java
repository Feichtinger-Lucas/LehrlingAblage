import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Audio {
	
	// Ausgabe von Ton

	public static void PlaySound(File Sound) {

		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {

		}

	}

}


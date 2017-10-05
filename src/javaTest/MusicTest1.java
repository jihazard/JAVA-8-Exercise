package javaTest;
import javax.sound.midi.*;

public class MusicTest1 {
		public void play() {
			try {
				Sequencer sequencer = MidiSystem.getSequencer();
			} catch (MidiUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("bummer");
			}
			System.out.println("we got a sequencer");
		}
		
		public static void main(String[] args){
			MusicTest1 mt=new MusicTest1();
			mt.play();
		}
}

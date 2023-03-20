public class SmartPhone extends Phone implements Camera,MusicPlayer{
	public void click(){
		System.out.println("Clicking..");
	}
	public void record(){
		System.out.println("Recording..");
		
	}
	public void play(){
		System.out.println("Playing..");
		
	}
	public void stop(){
		System.out.println("Stopping..");
		
	}
}
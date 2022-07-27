public class Television {
	Integer channel = 130;
	Integer volume = 20;

	void changeChannel(Integer newChannel) {
		if (channel.equals(newChannel)) {
			System.out.println("New channel is the same current channel");
		} else {
			channel = newChannel;
			System.out.println("Channel changed for " + channel);
		}
	} 
	
	void changeVolume(Integer newVolume) {
		if (volume.equals(newVolume)) {
			System.out.println("New volume is the same current volume");
		} else {
			volume = newVolume;
			System.out.println("Volume changed for " + volume);
		}
	}

	public static void main(String[] args) {
		Television tv = new Television();

		// Must not change the volume and channel
		tv.changeVolume(20);
		tv.changeChannel(130);
		
		// Must change the volume and channel
		tv.changeVolume(300);
		tv.changeChannel(10);
	}
}

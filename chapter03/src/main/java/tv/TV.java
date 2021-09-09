package tv;

public class TV {

	private int channel; 	//1~255
	private int volume;		//0~100
	private boolean power;	//꺼지면 아무것도 안되게
	
	public TV() {
		this.channel=7;
		this.volume=20;
		this.power=false;
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	
	public void status() {
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}

	public int getChannel() {
		return channel;
	}


	public int getVolume() {
		return volume;
	}


	public boolean isPower() {
		return power;
	}
	
	public void power(boolean on) {
		this.power=on;
	}
	public void channel(int channel) {
		if(channel>255 || channel<1) {
			
		}
		else {
			this.channel=channel;
		}
		
	}
	public void channel(boolean up) {
		if(up) {
			if(channel==255) {
				this.channel=255;
			}
			else {
				this.channel=channel+1;
			}
		}
		else {
			if(channel==0) {
				this.channel=1;
			}
			else {
				this.channel=channel-1;
			}
		}
	}
	public void volume(int volume) {
		if(volume >100) {
			this.volume=100;
		}
		else {
			this.volume=volume;
		}
	}
	public void volume(boolean up) {
		if(up) {
			if(volume==100) {
				this.volume=100;
			}
			else {
				this.volume=volume+1;
			}		
		}
		else {
			if(volume==0) {
				this.volume=0;
			}
			else {
				this.volume=volume-1;
			}
		}
	}
	
}

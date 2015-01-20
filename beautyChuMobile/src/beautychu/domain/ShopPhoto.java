package beautychu.domain;

import java.io.Serializable;

public class ShopPhoto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	int stylePhotoNumber;
	int styleNumber;
	String stylePhotoUrl;
	
	
	public int getStylePhotoNumber() {
		return stylePhotoNumber;
	}
	public void setStylePhotoNumber(int stylePhotoNumber) {
		this.stylePhotoNumber = stylePhotoNumber;
	}
	public int getStyleNumber() {
		return styleNumber;
	}
	public void setStyleNumber(int styleNumber) {
		this.styleNumber = styleNumber;
	}
	public String getStylePhoto() {
		return stylePhotoUrl;
	}
	public void setStylePhoto(String stylePhoto) {
		this.stylePhotoUrl = stylePhoto;
	}
	@Override
	public String toString() {
		return "StylePhoto [stylePhotoNumber=" + stylePhotoNumber
				+ ", styleNumber=" + styleNumber + ", stylePhoto=" + stylePhotoUrl
				+ "]";
	}
	
	
	
}
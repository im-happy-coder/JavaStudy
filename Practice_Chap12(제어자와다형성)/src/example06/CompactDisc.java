package example06;
//자손클래스
public class CompactDisc extends Product {
	
	
	private String albumTtitle;
	private String artist;
	
	
	

	public CompactDisc(int productID, String description, String maker, int price, String albumTtitle, String artist) {
		super(productID, description, maker, price);
		this.albumTtitle = albumTtitle;
		this.artist = artist;
	}

	public String getAlbumTtitle() {
		return albumTtitle;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public void showInfo() {
		super.showInfo(); //조상클래스의 메서드를 명시적으로 호출
		System.out.println("앨범 제목 >>" + this.getAlbumTtitle());
		System.out.println("가수 >>" + this.getArtist());
	}
	
	

}

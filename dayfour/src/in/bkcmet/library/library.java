package in.bkcmet.library;

public class library {
	public String libraryName;
	private long userId;
	String bookNamel;
	//Public method
	public void displayPublic() {
		System.out.println("Library Name : "+libraryName);
	}
	
	//Private Method
	private void displayPrivate() {
		System.out.println("UserId is : "+userId);
	}
	
	//Deafault Method
	void displayDefault()
	{
		System.out.println("BookName is : "+bookNamel);
	}
}

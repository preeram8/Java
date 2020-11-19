
abstract class Book {
	String title;
	
	abstract void setTitle(String title);
	
	String getTitle() {
		return title;
	}
	
}
	class myBook extends Book{
		public void setTitle(String s)
		{
		    title = s;
		}
		
		
	}

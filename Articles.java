
import java.util.Vector;

public class Articles {
	private String code;
	private int quantity;
	private String category;
	private double price;
	private static Vector<Articles> articles = new Vector<Articles>();
	private static int codArticle;
	
	public Articles(String code, String category, double price){
		this.code=code;
		this.category=category;
		this.price=price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public static void createArticle(String code, String category, double price){
		articles.addElement(new Articles(code, category, price));
		System.out.println("You have added below article to this database:\n");
 		System.out.println("Code: "+articles.get(codArticle).getCode()+"\n"+"Quantity: "+articles.get(codArticle).getQuantity()+"\n"+"Category: "+articles.get(codArticle).getCategory()+"\n"+"Price: "+articles.get(codArticle).getPrice());
		codArticle++;
	}
	
	public static void removeArticle(String code){
		int index=0;
		while (index<articles.size()){
			if(articles.get(index).code.equals(code)){
				System.out.println("You removed below article: \n");
				System.out.println("Code: "+articles.get(index).code+"\n"+"Category: "+articles.get(index).category+"\n"+"Quantity: "+articles.get(index).quantity+"\n");
				articles.remove(index);
			}
			else{
				System.out.println("Article indicated doesn't exist! \n");
				}
			index++;
		}
}
	
}

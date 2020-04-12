import java.util.List;

import com.sun.tools.javac.jvm.Items;

public class Receipt {
	
	private List<Items> items;
	
	public Receipt(List<Items> items) {
		this.items = items;
	}
	
	public List<Items> getItems() {
		return items;
	}
	
	public void setItems(List<Items> items) {
		this.items = items;
	}
	
	
	public static void main(String[] args) {
	
	}
}
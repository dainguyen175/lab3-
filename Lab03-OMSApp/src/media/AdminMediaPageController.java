package media;


import com.oms.bean.Media;


import abstractdata.ADataListPane;
import abstractdata.ADataPageController;

import cart.CartController;

public abstract class AdminMediaPageController extends ADataPageController<Media> {

	
	
	
	public AdminMediaPageController() {
		super();
	}
	
	public AdminMediaPageController(CartController cartController) {
		this();
		
	}
	
	
	
	@Override
	public ADataListPane<Media> createListPane() {
		return new AdminMediaListPane(this);
	}
	
	public abstract void ShowEdit(Media media);
}

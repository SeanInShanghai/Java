package simplefactory;

public class ButtonFactory {
	public Button createButton(char type){
		if(type == 'w'){
			return new WinButton();
		}else if(type == 'm'){
			return new MacButton();
		}else
			return null;
		
	}
}

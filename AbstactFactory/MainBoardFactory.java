package AbstractFactory;

public class MainBoardFactory {
	public static MainBoard createMainBorad(int type){
		MainBoard mainboard = null;
		
		if(1 == type){
			mainboard = new IntelMainBoard(755);
		}else if(2 == type){
			mainboard = new AmdMainBoard(938);
		}
		
		return mainboard;
	}
}

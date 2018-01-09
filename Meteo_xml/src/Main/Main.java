package Main;

import Control.Controller;
import View.Finestra;
import View.Finestra2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finestra f=new Finestra();
		Finestra2 f2=new Finestra2();
		Controller c=new Controller(f,f2);
		f.setVisible(true);
		f2.setVisible(false);
	}

}
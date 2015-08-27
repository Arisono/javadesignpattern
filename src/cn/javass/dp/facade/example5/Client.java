package cn.javass.dp.facade.example5;

public class Client {
	public static void main(String[] args) {
		FacadeApi api = FacadeFactory.createFacadeApi();
		
		api.generate();
	}
	
	
}
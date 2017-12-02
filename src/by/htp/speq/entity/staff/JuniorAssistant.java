package by.htp.speq.entity.staff;

public class JuniorAssistant extends Assistant {
	
	private static String position = "Junior Assistant";
	
	public static void greeting(String welcome) {
		System.out.println("-------");
		System.out.println(welcome + JuniorAssistant.position);
	}
	

}

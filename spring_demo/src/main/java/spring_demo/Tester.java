package spring_demo;

public class Tester
{
	
		public static void main(String[] args) 
		{
			
			Mobile m1 = new Mobile();
			m1.setBrand("Iphone");
			m1.setCost(65544);
			m1.setRam(8);
			m1.setSim(new Jio());
			
			System.out.println(m1);
			
			Mobile m2 = new Mobile();
			m2.setBrand("vivo");
			m2.setCost(5433);
			m2.setRam(8);
			m2.setSim(new Jio());
			System.out.println(m2);
			
			
}
}

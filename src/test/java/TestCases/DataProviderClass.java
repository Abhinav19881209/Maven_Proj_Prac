package TestCases;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name = "ProvideDatatoTC")
	public Object[][]  getData(Method m){
		
		if(m.getName().equalsIgnoreCase("login_TestCase")) {
			
			return new Object[][]
					{
					
						{"str3","Firoj"},
						{"browser","firefox"}
				
					};
				}else {
					return new Object[][]
							{
							
								{"str","Abhinav"},
								{"str1","Akshay"},
								
						
							};
					
				}
		
	
	}

}

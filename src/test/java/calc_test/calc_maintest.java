package calc_test;



import java.util.Map;

import org.testng.annotations.Test;

import Datautils.Data_Supplier;
import calculator_action1.Calc_additionact;
import calculator_action1.Calc_datecalculation;
import calculator_action1.Calc_lengthconverteract;
import calculator_action1.Function_using_manytimes;

public class calc_maintest extends Base_test {
	

	
	
	
	@Test(dataProvider="calc_data_file" , dataProviderClass=Data_Supplier.class)
	
	public void calculator_actions(Map obj) throws Exception  {
		Function_using_manytimes funcn = new Function_using_manytimes(driver);
		String choice = (String) obj.get("Choice");
		if(choice.equals("Addition")) {
		Calc_additionact action = new Calc_additionact(driver);
		action.adding_numbers((String) obj.get("Num1") ,  (String) obj.get("Operation") , (String) obj.get("Num2"));
		
		}else if(choice.equals("Length converter")) {
		Calc_lengthconverteract act = new Calc_lengthconverteract(driver);
		funcn.clicking_on_open_navigation();
		//act.clicking_on_open_navigation();
		act.click_on_length((String) obj.get("Function"));
		act.selecting_inputunit((String) obj.get("Numofunit"));
		act.click_onslected_unit((String) obj.get("Unit"));
		act.entering_number((String) obj.get("Length_num"));
		act.taking_outputunit_value();
		funcn.againclick_on_opennavigation();
		funcn.click_on_standard();
//		act.againclick_on_opennavigation();
//		act.click_on_standard();
		}else {
		Calc_datecalculation dc = new Calc_datecalculation(driver);
		funcn.clicking_on_open_navigation();
//		dc.clicking_on_open_navigation();
		dc.click_datecalculation((String) obj.get("Function"));
		dc.click_onfromdate((String) obj.get("Month") , (String) obj.get("Date"));
		dc.click_ontodate((String) obj.get("Year"), (String) obj.get("Month") ,(String) obj.get("Date"));
		dc.taking_difference_between_dates();
		funcn.againclick_on_opennavigation();
		funcn.click_on_standard();
		}
	}

}

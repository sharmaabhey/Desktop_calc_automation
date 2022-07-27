package calc_test;

import org.testng.annotations.Test;

import calculator_action1.Calc_act1;
import calculator_action2.Calc_act2;

public class calc_maintest extends Base_test {
	

	
	
	
	@Test
	
	public void calculator_actions() throws Exception {
		
		
		Calc_act1 action = new Calc_act1(driver);
		action.adding_numbers();
		
		
		Calc_act2 act = new Calc_act2(driver);
		act.clicking_on_open_navigation();
		act.click_on_length();
		act.selecting_inputunit();
		act.click_onslected_unit();
		act.entering_number();
		act.taking_outputunit_value();
		act.againclick_on_opennavigation();
		act.click_on_standard();
		
	}

}

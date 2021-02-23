package com.mindtree.SimpleCalculator;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.Test;

public class BasicTest {

	 @Test
	    public void shouldAddTwoNumbers() {
	        //given
	        Calculator calculator = new Calculator();

	        //when
	        int result = calculator.addition(25, 30);

	        //then
	        assertThat(result).isEqualTo(5);
	    }

	    @Test
	    public void shouldSubtractTwoNumbers() {
	        //given
	        Calculator calculator = new Calculator();

	        //when
	        int result = calculator.subtraction(5, 3);

	        //then
	        assertThat(result).isEqualTo(2);
	    }

	   
}

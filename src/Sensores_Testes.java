import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Sensores_Testes {
	

	public Sensores sens;
	@BeforeEach
	void init() {
		sens = new Sensores();
		sens.add(30, 5);
		sens.add(10, 2);
		sens.add(25, 7);
		sens.add(50, 9);
		sens.setH(1, false);
		
	}
	
	@Test
	//Testa isH para um sensor habilitado
	void test01() {
		assertEquals(true,2);
	}
	
	@Test
	//Testa isH para um sensor desabilitado
	void test02() {
		assertEquals(false,2);
	}
	
	@Test
	//Testa isAlerta para um sensor desabilitado
	void test03() {
		assertEquals(0,2);
	}
	
	@Test
	//Testa isAlerta para um sensor habilitado vermelho
	void test04() {
		assertEquals(3,2);
	}
	
	@Test
	//Testa isAlerta para um sensor habilitado laranja
	void test05() {
		assertEquals(2,2);
	}
	
	@Test
	//Testa isAlerta para um sensor habilitado amarelo
	void test06() {
		assertEquals(1,2);
	}
	
	
	
	
	
	

}

	
	

	
	
	



	


package com.atividade3.vacinapb;

import com.atividade3.vacinapb.build.UsuarioBuild;
import com.atividade3.vacinapb.dominio.Usuario;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;



@SpringBootTest
class VacinapbApplicationTests {

	@Autowired
	public UsuarioBuild usuarioBuild;


	@Test
	public void TesteCadastroVazioOuIgual() {
		Usuario cadastro1 = usuarioBuild.ConstruirUsuario1();
		Usuario cadastro2 = usuarioBuild.ConstruirUsuario2();
		Assert.assertNotNull(cadastro1);
		Assert.assertNotNull(cadastro2);
		Assert.assertNotSame(cadastro1, cadastro2);

	}
}

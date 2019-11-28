import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBuyukHarf() {
		String sonuc=MetinIslemleri.buyukHarf("murat");
		org.junit.Assert.assertEquals("MURAT", sonuc);
		
	}

}

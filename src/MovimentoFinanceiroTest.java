import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class MovimentoFinanceiroTest {

	@Test
	public void calculaJurosTest() {
		MovimentoFinanceiro mf = new MovimentoFinanceiro();	
        mf.calculaJuros(100);
		assertEquals(Double.valueOf(mf.getValorOriginal()), Double.valueOf(100));
		assertEquals(Double.valueOf(mf.getValorJuros()), Double.valueOf(10));
		assertEquals(Double.valueOf(mf.getValorPagamento()), Double.valueOf(110));
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void calculaJurosExceptionTest() {
		MovimentoFinanceiro mf = new MovimentoFinanceiro();	
		mf.calculaJuros(0);
	}
	
	@Test
	public void geraVencimentoTeste() {
		MovimentoFinanceiro mf = new MovimentoFinanceiro();
        mf.geraVencimento(LocalDate.now());
		assertEquals(mf.getDataVencimento(), LocalDate.now().plusDays(30));
		
	}

	
		
}

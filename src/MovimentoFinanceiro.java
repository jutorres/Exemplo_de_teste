import java.time.LocalDate;

public class MovimentoFinanceiro implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LocalDate dataPagamento;
	private LocalDate dataVencimento;
	private double valorOriginal;
	private double valorJuros;
	private double valorPagamento;
	
	
	public MovimentoFinanceiro() {
		
	}
	
	
	
	public MovimentoFinanceiro(LocalDate dataPagamento, LocalDate dataVencimento, double valorOriginal,
			double valorJuros, double valorPagamento) {
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
		this.valorOriginal = valorOriginal;
		this.valorJuros = valorJuros;
		this.valorPagamento = valorPagamento;
	}



	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public double getValorOriginal() {
		return valorOriginal;
	}
	public void setValorOriginal(double valorOriginal) {
		this.valorOriginal = valorOriginal;
	}
	public double getValorJuros() {
		return valorJuros;
	}
	public void setValorJuros(double valorJuros) {
		this.valorJuros = valorJuros;
	}
	public double getValorPagamento() {
		return valorPagamento;
	}
	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}
	
	public void geraVencimento(LocalDate emissao) {
		emissao = LocalDate.now();
		this.dataVencimento = emissao.plusDays(30);
		
	}
	
	public void calculaJuros(double valorOriginal) throws IllegalArgumentException{
		if (valorOriginal == 0.0) {
			throw new IllegalArgumentException();
		}
		this.valorOriginal = valorOriginal;
		this.valorJuros =  valorOriginal * 0.1;
		this.valorPagamento = valorOriginal + valorJuros;

	}
	
}

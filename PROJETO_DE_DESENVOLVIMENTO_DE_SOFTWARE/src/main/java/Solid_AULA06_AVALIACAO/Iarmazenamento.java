package Solid_AULA06_AVALIACAO;

public interface Iarmazenamento {
	
	public void salvar(Iveiculos veiculo);
	
	public void atualizar(Veiculo veiculo);
	
	public void deletar(int id);
	
	public Object getById(int id);
	
	
}

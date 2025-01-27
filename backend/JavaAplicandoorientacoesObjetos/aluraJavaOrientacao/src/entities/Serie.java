package entities;

public class Serie extends Titulo {
	
	private int minutosPorEpisodios; 
	private int episodiosPorEpisodios; 
	private int temporadas;
	private boolean ativas;
	
	
	public int getMinutosPorEpisodios() {
		return minutosPorEpisodios;
	}
	public void setMinutosPorEpisodios(int minutosPorEpisodios) {
		this.minutosPorEpisodios = minutosPorEpisodios;
	}
	public int getEpisodiosPorEpisodios() {
		return episodiosPorEpisodios;
	}
	public void setEpisodiosPorEpisodios(int episodiosPorEpisodios) {
		this.episodiosPorEpisodios = episodiosPorEpisodios;
	}
	public int getTemporas() {
		return temporadas;
	}
	public void setTemporas(int temporas) {
		this.temporadas = temporas;
	}
	public boolean isAtivas() {
		return ativas;
	}
	public void setAtivas(boolean ativas) {
		this.ativas = ativas;
	}
	
	@Override
	public int getDuracaoEmMinutos() {
		return temporadas * episodiosPorEpisodios * minutosPorEpisodios;
	}

}

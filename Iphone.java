public class IPhone extends AparelhoTelefonico implements NavegadorInternet, ReprodutorMusical{

	@Override
	public String tocar() {
		return "esta tocando";
	}

	@Override
	public String pausar() {
		return "esta pausado";
	}

	@Override
	public String selecionarMusica() {
		return "esta selecionado";
	}

	@Override
	public String exibirPagina() {
		return "pagina exibida";
	}

	@Override
	public String adicionarNovaAba() {
		return "nova aba exibida";
	}

	@Override
	public String AtualizarPagina() {
		return "pagina atualizada";
	}

}
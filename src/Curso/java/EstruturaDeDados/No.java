package Curso.java.EstruturaDeDados;

public class No <T>{

	private T conteudo;

	private No<T> proximoNo;

	public No(T conteudo) {
		this.proximoNo = null;
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public No<T> getProximoNo() {
		return proximoNo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public void setProximoNo(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "no{" + " conteudo = "+ conteudo + '\'' + '}';
	}

}

package Curso.java.filas;

public class Fila {

	private No refNoEntrada;

	public Fila() {
		this.refNoEntrada = null;
	}

	public void enqueue(No novoNo) {
		novoNo.setRefNo(refNoEntrada);
		refNoEntrada = novoNo;

	}

	public No first() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntrada;
			while (true) {
				if (primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				} else {
					break;
				}
			}
			return primeiroNo;
		}
		return null;
	}

	public No dequeue() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntrada;
			No noAuxiliar = refNoEntrada;
			while (true) {
				if (primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				} else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return primeiroNo;
		}
		return null;
	}

	public boolean isEmpty() {
		return refNoEntrada == null ? true : false;
	}

	@Override
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = refNoEntrada;

		if (refNoEntrada != null) {
			while (true) {
				stringRetorno += "[No{Objeto=" + noAuxiliar.getObject() + "}]--->";
				// noAuxiliar = noAuxiliar.getRefNo();

				if (noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();

				}else {
					stringRetorno += "null";
					break;
				}
			}
			//return "Fila [refNoEntrada=" + refNoEntrada + "]";
		} else {

			stringRetorno = "null";
		}
		return stringRetorno;
	}

}

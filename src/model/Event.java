package model;

public class Event {
	
	private String TituloDelEvento;
	private String DescripcionDelEvento;
	private String FechaYHora;
	private String Ubicacion;
	private String ImagenBase64;
	
	public Event(String tituloDelEvento, String descripcionDelEvento, String fechaYHora, String ubicacion,
			String imagenBase64) {
		super();
		TituloDelEvento = tituloDelEvento;
		DescripcionDelEvento = descripcionDelEvento;
		FechaYHora = fechaYHora;
		Ubicacion = ubicacion;
		ImagenBase64 = imagenBase64;
	}

	public String getTituloDelEvento() {
		return TituloDelEvento;
	}

	public void setTituloDelEvento(String tituloDelEvento) {
		TituloDelEvento = tituloDelEvento;
	}

	public String getDescripcionDelEvento() {
		return DescripcionDelEvento;
	}

	public void setDescripcionDelEvento(String descripcionDelEvento) {
		DescripcionDelEvento = descripcionDelEvento;
	}

	public String getFechaYHora() {
		return FechaYHora;
	}

	public void setFechaYHora(String fechaYHora) {
		FechaYHora = fechaYHora;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}

	public String getImagenBase64() {
		return ImagenBase64;
	}

	public void setImagenBase64(String imagenBase64) {
		ImagenBase64 = imagenBase64;
	}

	@Override
	public String toString() {
		return "Event [TituloDelEvento=" + TituloDelEvento + ", DescripcionDelEvento=" + DescripcionDelEvento
				+ ", FechaYHora=" + FechaYHora + ", Ubicacion=" + Ubicacion + ", ImagenBase64=" + ImagenBase64 + "]";
	}
	
}
package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import model.Event;

public class ShalomService {
	final private String apiUrl = "https://shalomws.onrender.com/api/events/setEvent";
	
	public void postService(Event evento) {
		try {
			//Instanciar el servicio
			URL url = new URL(apiUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setDoOutput(true);
			
			// Crear el JSON con los datos del evento
            String jsonInput = String.format(
                    "{ \"TituloDelEvento\": \"%s\", \"DescripcionDelEvento\": \"%s\", \"FechaYHora\": \"%s\", \"Ubicacion\": \"%s\", \"ImagenBase64\": \"%s\" }",
                    evento.getTituloDelEvento(), evento.getDescripcionDelEvento(), evento.getFechaYHora(), evento.getUbicacion(), evento.getImagenBase64()
            );
            
            //Consumir el servicio
            OutputStream os = conn.getOutputStream();
            os.write(jsonInput.getBytes());
            os.flush();
            os.close();
            
            //Leer la respuesta
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
				response.append(line);
				System.out.println(line);
			}
            br.close();
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
}

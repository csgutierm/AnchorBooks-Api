package com.edutecno;

import java.util.List;

import com.edutecno.model.Book;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class App {
	public static void main(String[] args) {

		System.out.println("-1-------------------");
		System.out.println("Crear un proyecto del tipo Maven en Eclipse.");
		System.out.println("-2-------------------");
		System.out.println("Agregar las dependencias de Jersey al proyecto");
		System.out.println("-3-------------------");
		System.out.println("Revisar las API mediante Postman o algún navegador");
		System.out.println("-4-------------------");
		System.out.println("Crear la clase Book");
		System.out.println("-5-------------------");
		System.out.println("Crear la clase BookDetail");
		System.out.println("-6-------------------");
		System.out.println("Crear el método para obtener la lista de todos los libros desde la primera API e\r\n"
				+ "imprimirlos en pantalla.");
		getAllBooks6();
		System.out.println("-7-------------------");
		System.out.println("Crear el método para obtener la lista de libros desde la API e imprimirlos en pantalla\r\n"
				+ "con el siguiente formato (Autor + Título)");
		getAllBooks7();
		System.out.println("-8-------------------");
		System.out.println("Crear el método para obtener la lista de los libros ubicados en la posición 3 y 8 e\r\n"
				+ "imprimirlos en pantalla con el siguiente formato");
		getAllBooks8();
		System.out.println("-9-------------------");
		System.out.println("Crear el método para obtener el detalle de todos los libros directamente desde la API\r\n"
				+ "detalles.");
		getAllBooksDetails9();
		System.out.println("-10------------------");
		System.out.println("Crear el método para obtener aquellos libros cuyo autor sean anónimos o\r\n" + "'Unknown'");
		getAllBooks10();
		System.out.println("-11------------------");
		System.out.println("Crear el método para obtener aquellos libros cuyo delivery sea true,");
		getAllBooksDetails11();

	}

	// metodos
	// Crear el método para obtener la lista de todos los libros desde la
	// primera API e imprimirlos en pantalla.
	public static void getAllBooks6() {

		// Crear un cliente
		Client client = ClientBuilder.newClient();

		// Cliente consume desde una API alguna información
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");

		// WebTarget construye el Request
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		// El builder tiene la información del request y le pedimos ejecutar un get
		Response respuestaBooks = invocationBuilder.get();

		// A la respuest le pedimos que lea la información
		List<Book> listaBook = respuestaBooks.readEntity(new GenericType<List<Book>>() {
		});

		// Obtenemos según id uno a uno
//		System.out.println(listaBook.get(0));
//		System.out.println(listaBook.get(1));
		// etc
		System.out.println("-----------------");
		// o todos a la vez
		for (Book bookTemp : listaBook) {
			System.out.println(bookTemp);
		}

	}

	public static void getAllBooks7() {

		// Crear un cliente
		Client client = ClientBuilder.newClient();

		// Cliente consume desde una API alguna información
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");

		// WebTarget construye el Request
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		// El builder tiene la información del request y le pedimos ejecutar un get
		Response respuestaBooks = invocationBuilder.get();

		// A la respuest le pedimos que lea la información
		List<Book> listaBook = respuestaBooks.readEntity(new GenericType<List<Book>>() {
		});

		System.out.println("-----------------");
		// o todos a la vez
		for (Book bookTemp : listaBook) {
			System.out.println(bookTemp.getAuthor() + ": " + bookTemp.getTitle());
		}

	}

	public static void getAllBooks8() {

		// Crear un cliente
		Client client = ClientBuilder.newClient();

		// Cliente consume desde una API alguna información
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");

		// WebTarget construye el Request
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		// El builder tiene la información del request y le pedimos ejecutar un get
		Response respuestaBooks = invocationBuilder.get();

		// A la respuest le pedimos que lea la información
		List<Book> listaBook = respuestaBooks.readEntity(new GenericType<List<Book>>() {
		});

		System.out.println("-----------------");
		System.out.println("-----------------");
		System.out.println("Libro número 3: " + listaBook.get(3).getAuthor() + ", " + listaBook.get(3).getTitle() + ", "
				+ listaBook.get(3).getCountry());
		System.out.println("Libro número 8: " + listaBook.get(8).getAuthor() + ", " + listaBook.get(8).getTitle() + ", "
				+ listaBook.get(8).getCountry());

	}

	public static void getAllBooksDetails9() {

		// Crear un cliente
		Client client = ClientBuilder.newClient();

		// Cliente consume desde una API alguna información
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks")
				.path("bookDetail");

		// WebTarget construye el Request
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		// El builder tiene la información del request y le pedimos ejecutar un get
		Response respuestaBooks = invocationBuilder.get();

		// A la respuest le pedimos que lea la información
		List<BookDetail> listaBook = respuestaBooks.readEntity(new GenericType<List<BookDetail>>() {
		});

		System.out.println("-----------------");
		// o todos a la vez
		for (BookDetail bookTemp : listaBook) {
			System.out.println(bookTemp);
		}

	}

	public static void getAllBooks10() {

		// Crear un cliente
		Client client = ClientBuilder.newClient();

		// Cliente consume desde una API alguna información
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");

		// WebTarget construye el Request
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		// El builder tiene la información del request y le pedimos ejecutar un get
		Response respuestaBooks = invocationBuilder.get();

		// A la respuest le pedimos que lea la información
		List<Book> listaBook = respuestaBooks.readEntity(new GenericType<List<Book>>() {
		});

		System.out.println("-----------------");
		System.out.println("Autores anónimos");
		System.out.println();
		System.out.println();

		for (Book bookTemp : listaBook) {

			if (bookTemp.getAuthor().equals("Unknown")) {
				System.out.println("Author: " + bookTemp.getAuthor() + " - libro: " + bookTemp.getTitle());
			}

		}

	}

	public static void getAllBooksDetails11() {

		// Crear un cliente
		Client client = ClientBuilder.newClient();

		// Cliente consume desde una API alguna información
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks")
				.path("bookDetail");

		// WebTarget construye el Request
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		// El builder tiene la información del request y le pedimos ejecutar un get
		Response respuestaBooks = invocationBuilder.get();

		// A la respuest le pedimos que lea la información
		List<BookDetail> listaBook = respuestaBooks.readEntity(new GenericType<List<BookDetail>>() {
		});

		System.out.println("-----------------");
		System.out.println("Libros con delivery disponibles: ");
		System.out.println();
		System.out.println();

		for (BookDetail bookTemp : listaBook) {

			if (bookTemp.isDelivery()) {
				System.out.println("Libro: " + bookTemp.getTitle());
			}

		}

	}
}

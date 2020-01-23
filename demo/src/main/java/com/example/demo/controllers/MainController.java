package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.Book;
import com.example.demo.domain.Person;
import com.example.demo.services.BookService;

@Controller
public class MainController {
	private BookService bookService;

	public MainController(BookService bookService) {
        this.bookService = bookService;
    }

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		StringBuilder texto = new StringBuilder();
		
		for (Book book : bookService.getAll()) {
			texto.append("Titulo: ");
			texto.append(book.getTitle().toString());
			texto.append("\n");
			texto.append("Año de publicación: ");
			texto.append(book.getPublished().toString());
			
			if (book.getCharacters() != null) {
				texto.append("\n");
				texto.append("Personajes: ");
				texto.append(book.getCharacters().size());
				texto.append("\n");
				
				for (Person character : book.getCharacters()) {
					texto.append("Personaje: ");
					texto.append(character.getName());
					texto.append("\n");
				}
			}
			
			
			texto.append("\n");
			texto.append("\n");
		}
		
		return texto.toString();
	}
}
package com.example.demo.controllers;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.Book;
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
			texto.append("\t");
			texto.append("Año de publicación: ");
			texto.append(book.getPublished().toString());
			
			if (book.getCharacters() != null) {
				texto.append("\t");
				texto.append("Personajes: ");
				texto.append(book.getCharacters().size());
			}
			
			
			texto.append("\t");
			texto.append("\t");
		}
		
		return texto.toString();
	}
}
package com.example.demo;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biblioteca")
public class Controller {
    // Declaração da variável livros
    private LinkedList<Livro> livros;

    public Controller() {
        livros = new LinkedList<>();
        livros.add(new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        livros.add(new Livro(2, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997));
        // Adicione mais livros conforme necessário
    }

    // Este é um endpoint que retorna uma mensagem de boas-vindas
    @GetMapping("")
    @CrossOrigin(origins = "*")
    public String mensagemDeBemVindo() {
        return "Bem vindo a biblioteca central";
    }

    // Este endpoint retorna uma lista de livros
    @GetMapping("/livros")
    @CrossOrigin(origins = "*")
    public LinkedList<Livro> getLivros() {
        // Aqui, idealmente, você retornaria uma lista de livros,
        // mas neste exemplo, a variável 'livros' não está declarada
        // Então, isso pode gerar um erro de compilação
        return livros;
    }
}

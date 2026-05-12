package br.com.fiap._tdszmvc.controller;

import br.com.fiap._tdszmvc.model.Categoria;
import br.com.fiap._tdszmvc.model.Livro;
import br.com.fiap._tdszmvc.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {
    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping("/lista")
    public String listarLivro(Model model) {
        List<Livro> livros = livroService.readLivros();
        model.addAttribute("listaLivros", livros);
        return "livroLista";
    }

    @GetMapping("/cadastro")
    public String cadatroLivro(Model model) {
        model.addAttribute("livro", new Livro());
        model.addAttribute("categoriaLista", Arrays.asList(Categoria.values()));
        return "livroCadastro";
    }

    @PostMapping("/cadastrar")
    public String cadastrarLivro(@Valid Livro livro, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("livro", livro);
            model.addAttribute("categoriaLista", Arrays.asList(Categoria.values()));
            return "livroCadastro";
        }
        if (livro.getId() == null) {
            livroService.createLivro(livro);
        } else {
            livroService.updateLivro(livro);
        }
        return listarLivro(model);
    }

    @GetMapping("/deletar/{id}")
    public String deletarLivro(@PathVariable Long id, Model model) {
        livroService.deleteLivro(id);
        return listarLivro(model);
    }
}

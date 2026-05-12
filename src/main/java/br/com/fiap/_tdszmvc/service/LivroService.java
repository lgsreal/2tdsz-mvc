package br.com.fiap._tdszmvc.service;

import br.com.fiap._tdszmvc.model.Livro;
import br.com.fiap._tdszmvc.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository){
        this.livroRepository = livroRepository;
    }

    public Livro createLivro(Livro livro){
        return livroRepository.save(livro);
    }

    public Livro readLivro(Long id){
        return livroRepository.findById(id).orElse(null);
    }

    public List<Livro> readLivros(){
        return livroRepository.findAll();
    }

    public Livro updateLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public void deleteLivro(Long id) {
        livroRepository.deleteById(id);
    }

}

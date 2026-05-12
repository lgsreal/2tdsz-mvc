package br.com.fiap._tdszmvc.repository;

import br.com.fiap._tdszmvc.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}

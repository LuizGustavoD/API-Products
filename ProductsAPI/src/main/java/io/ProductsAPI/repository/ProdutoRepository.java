package io.ProductsAPI.repository;

import io.ProductsAPI.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, String> {

    @Query("SELECT p FROM Produto p WHERE p.name LIKE %?1%")
    List<Produto> searchGroup(String name);
}
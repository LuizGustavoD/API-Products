package io.ProductsAPI.controller;

import io.ProductsAPI.model.Produto;
import io.ProductsAPI.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/produto")
public class ProdutoController {

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    private final ProdutoRepository produtoRepository;

    @PostMapping("/insert")
    public void insert(@RequestBody Produto produto){
        System.out.println("Salvando esse produto: " + produto);
        produto.setId(UUID.randomUUID().toString());
        produtoRepository.save(produto);
    }

    @GetMapping("/search")
    public List<Produto> search(@RequestParam("name") String name){
        System.out.println("Buscando entidades pelo nome " + name);
        return produtoRepository.searchGroup(name);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") String id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable("id") String id, Produto produto){
        System.out.println("Atualizando o produto com ID: " + id);
        produto.setId(id);
        produtoRepository.save(produto);
    }

}

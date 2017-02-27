package com.sgcom.web.dao;

import java.util.Collection;

import com.sgcom.web.model.Categoria;

public interface CategoriaDAO {
	
	public void save(Categoria categoria);
	
	public void update(Categoria categoria);
	
	public void delete(Categoria categoria);
	
	public Categoria getCategoriaById(int categoriaId);
	
	public Collection<Categoria> listCategorias();
}

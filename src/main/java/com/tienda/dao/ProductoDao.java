package com.tienda.dao;

import com.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

//interface que hereda de otra
public interface ProductoDao extends JpaRepository<Producto, Long> {

}

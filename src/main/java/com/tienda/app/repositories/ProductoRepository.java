package com.tienda.app.repositories;

import com.tienda.app.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Puedes agregar métodos personalizados si es necesario
}

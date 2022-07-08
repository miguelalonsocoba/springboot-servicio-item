package com.formacionbdi.springboot.app.item.models.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.item.clientes.ProductoClienteRest;
import com.formacionbdi.springboot.app.item.models.Item;
import com.formacionbdi.springboot.app.item.models.service.IItemService;

@Service(value = "serviceFeign")
@Primary // Se indica que esta interfaz sera la implementación por defecto que se tiene
			// que inyectar en el Autowired. Otra opción es utilizando la anotación
			// @Qualifier.
public class ItemServiceFeign implements IItemService {

	@Autowired
	private ProductoClienteRest productoClienteRestFeign;

	@Override
	public List<Item> findAll() {
		return productoClienteRestFeign.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return new Item(productoClienteRestFeign.detalle(id), cantidad);
	}

}

package pe.dhexsoft.CrudBasic.service;

import pe.dhexsoft.CrudBasic.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer guardar(Customer customer);
    List<Customer> Listar();
    Customer ListarXId(Long id);
    Customer modificar(Customer customer);
    void eliminar(Long id);

}

package pe.dhexsoft.CrudBasic.service;

import org.springframework.stereotype.Service;
import pe.dhexsoft.CrudBasic.entity.Customer;
import pe.dhexsoft.CrudBasic.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    //constructor con inyeccion de dependencia
    private final CustomerRepository customerService;

    public CustomerServiceImpl(CustomerRepository customerService) {
        this.customerService = customerService;
    }


    @Override
    public Customer guardar(Customer customer) {

        return customerService.save(customer);
    }

    @Override
    public List<Customer> Listar() {

        return customerService.findAll();
    }

    @Override
    public Customer ListarXId(Long id) {
        // ala espera
        return null;
    }

    @Override
    public Customer modificar(Customer customer) {

        return customerService.save(customer);
    }

    @Override
    public void eliminar(Long id) {

        customerService.deleteById(id);
    }
}

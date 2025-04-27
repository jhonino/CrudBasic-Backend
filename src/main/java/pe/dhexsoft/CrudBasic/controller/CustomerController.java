package pe.dhexsoft.CrudBasic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.dhexsoft.CrudBasic.entity.Customer;
import pe.dhexsoft.CrudBasic.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class CustomerController {

    //inyeccion de dependencia
    @Autowired
    private CustomerService customerService;


    //metodos que se communication con el front
    @PostMapping
    public Customer guardando(@RequestBody Customer customer){
        return customerService.guardar(customer);
    }

    @GetMapping
    public List<Customer> listando(){
        return  customerService.Listar();
    }

    @GetMapping("/{id}")
    public Customer listandoTodo(@PathVariable Long id){
        return customerService.ListarXId(id);
    }

    @DeleteMapping("/{id}")
    public void borrando(@PathVariable Long id){
        customerService.eliminar(id);
    }

    @PutMapping
    public Customer modificando(@RequestBody Customer customer){
        Customer customerDb = customerService.ListarXId(customer.getId());
        customerDb.setFirstName(customer.getFirstName());
        customerDb.setLastName(customer.getLastName());
        customerDb.setMail(customer.getMail());
        return  customerService.modificar(customerDb);
    }
}

package pe.dhexsoft.CrudBasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.dhexsoft.CrudBasic.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

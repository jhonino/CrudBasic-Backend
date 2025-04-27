package pe.dhexsoft.CrudBasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.dhexsoft.CrudBasic.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

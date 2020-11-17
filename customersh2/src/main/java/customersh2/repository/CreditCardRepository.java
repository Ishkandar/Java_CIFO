package customersh2.repository;

import org.springframework.data.repository.CrudRepository;

import customersh2.model.CreditCard;

public interface CreditCardRepository extends CrudRepository<CreditCard, Long> {

	CreditCard findById(long id);
}
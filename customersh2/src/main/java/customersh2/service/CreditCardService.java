package customersh2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customersh2.model.CreditCard;
import customersh2.repository.CreditCardRepository;


@Service
public class CreditCardService {

	@Autowired
	CreditCardRepository repository;

	
	public Iterable<CreditCard> findAll() {

		return repository.findAll();
	}

}
/**
 * 
 */
package com.learning.currencymicroservices.currencyexchangeservices;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ashutosh
 *
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from,String to);

}

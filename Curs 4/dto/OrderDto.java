package dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderDto {

	public BigDecimal totalPrice;
	public LocalDate creationDate;

	public OrderDto() {
	}

	public OrderDto(BigDecimal totalPrice, LocalDate creationDate) {
		this.totalPrice = totalPrice;
		this.creationDate = creationDate;
	}
}

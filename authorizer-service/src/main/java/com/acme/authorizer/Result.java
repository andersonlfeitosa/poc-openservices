package com.acme.authorizer;

import lombok.*;

import java.math.BigDecimal;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Result {

	@Getter
	@Setter
	private Operation operation;

	@Getter
	@Setter
	private BigDecimal x;

	@Getter
	@Setter
	private BigDecimal y;

	@Getter
	@Setter
	private BigDecimal result;

}
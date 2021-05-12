package com.acme.calc;

import lombok.*;

import java.math.BigDecimal;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Result {

	private Operation operation;
	private BigDecimal x;
	private BigDecimal y;
	private BigDecimal result;

}
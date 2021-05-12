package com.acme.authorizer;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Result {

	private LocalDateTime datetime;
	private String version;
	private String uuid;

}
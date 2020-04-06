package com.acme.greeting;

import lombok.*;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Greeting {

	@Getter
	@Setter
	private long id;

	@Getter
	@Setter
	private String content;

}

package com.acme.greeting;

import lombok.*;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Greeting {

	private long id;
	private String content;

}

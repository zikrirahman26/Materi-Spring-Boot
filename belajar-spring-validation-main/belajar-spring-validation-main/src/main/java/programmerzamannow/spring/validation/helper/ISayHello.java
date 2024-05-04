package programmerzamannow.spring.validation.helper;

import javax.validation.constraints.NotBlank;

import org.springframework.validation.annotation.Validated;

@Validated
public interface ISayHello {

  String sayHello(@NotBlank String name);

}

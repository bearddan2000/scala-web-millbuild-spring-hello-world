package hello

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

	@GetMapping
  def index() = "hello world\n"

}

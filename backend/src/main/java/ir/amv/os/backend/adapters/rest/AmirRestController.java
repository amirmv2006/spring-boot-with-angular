package ir.amv.os.backend.adapters.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amir
 */
@RestController
public class AmirRestController {

  @GetMapping("amir")
  public SampleDto sayHello(@RequestParam String name) {
    return new SampleDto("Hello", name);
  }

  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  static class SampleDto {
    private String firstName;
    private String lastName;
  }
}

package com.netolanches.Tapiocas

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.Optional

@RestController
class TapiocasController(val foodsRepository: FoodsRepository) {

  @GetMapping("/food")
  fun getFilingsByFoodId(@RequestParam("id") id: Int = 0): Optional<Foods>{
    val food: Optional<Foods> = foodsRepository.findById(id);
    return food;
  }
}
package com.netolanches.Tapiocas

import com.example.NetoTapiocas.FilingsRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.Optional

@RestController
class TapiocasController(val foodsRepository: FoodsRepository, val filingsRepository: FilingsRepository) {

  @GetMapping("/food")
  fun getFilingsByFoodId(@RequestParam("id") id: Int = 0): Map<String, Any> {
    try{
      val food: Optional<Foods> = foodsRepository.findById(id);
      val filings = filingsRepository.getAllFilingsByFoodId(id);
      val response =
        mapOf("price" to food.get().price,
              "filings" to filings)
      return response;
    }catch (e: Exception){
      return mapOf("error" to e.message.toString())
    }
  }
}
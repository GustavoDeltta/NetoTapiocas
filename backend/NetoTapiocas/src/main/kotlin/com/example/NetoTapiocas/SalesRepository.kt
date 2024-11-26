package com.example.NetoTapiocas

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.data.jpa.repository.JpaRepository

@Entity
@Table(name = "sales")
data class Sales(
    @Id val id: Int,
    val idFood: Int,
    val cpf: String,
    val dateSale: String,
    val description: String,
    val price: Float
)
interface SalesRepository: JpaRepository<Sales, Int>{
}
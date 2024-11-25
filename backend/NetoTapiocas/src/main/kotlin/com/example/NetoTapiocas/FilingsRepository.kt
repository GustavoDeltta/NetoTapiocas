package com.example.NetoTapiocas
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "filings")
data class Filings (
    @Id val id: Int,
    @Id val idFood: Int,
    val name: String,
    val price: Float
)
interface FilingsRepository {
}
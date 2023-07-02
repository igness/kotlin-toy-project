package dev.igness.kotlintoyproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinToyProjectApplication

fun main(args: Array<String>) {
    runApplication<KotlinToyProjectApplication>(*args)
}

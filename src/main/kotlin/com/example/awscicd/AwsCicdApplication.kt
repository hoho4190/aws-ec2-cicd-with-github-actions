package com.example.awscicd

import mu.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.info.BuildProperties
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

private val logger = KotlinLogging.logger { }

@SpringBootApplication
class AwsCicdApplication

fun main(args: Array<String>) {
	runApplication<AwsCicdApplication>(*args)
}

@RestController
class Controller(
	private var buildProperties: BuildProperties // gradle에 buildInfo 추가
) {
	@GetMapping
	fun getVersion(): String {
		logger.info { "getVersion - ${buildProperties.version}" }
		return buildProperties.version
	}
}

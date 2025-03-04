package dev.euns.fishingstopserver.domain.scenario.controller

import dev.euns.fishingstopserver.domain.scenario.dto.reqeust.CreateScenarioRequest
import dev.euns.fishingstopserver.domain.scenario.dto.response.CreateScenarioResponse
import dev.euns.fishingstopserver.domain.scenario.repository.ScenarioRepository
import dev.euns.fishingstopserver.domain.scenario.service.ScenarioService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/senario")
class ScenarioController(
    private val scenarioService: ScenarioService,
) {
    @PostMapping
    suspend fun createScenario(@RequestBody request: CreateScenarioRequest): ResponseEntity<CreateScenarioResponse> {
        return scenarioService.createScenario(request)
    }
//    @GetMapping
//    fun getScenario(@RequestBody request: CreateScenarioRequest): String {
//        return "";
//    }
}


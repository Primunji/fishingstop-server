package dev.euns.fishingstopserver.global.config

import org.springframework.stereotype.Component

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Component
annotation class Gateway(val path: String)

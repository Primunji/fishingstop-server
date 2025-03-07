package dev.euns.scenarioserver.global.exception.jwt


import dev.euns.scenarioserver.global.exception.CustomErrorCode
import org.springframework.http.HttpStatus

enum class JwtErrorCode (
    override val status: HttpStatus,
    override val state: String,
    override val message: String,
): CustomErrorCode {
    JWT_TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", "토큰이 만료되었습니다."),
    JWT_TOKEN_SIGNATURE_ERROR(HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", "토큰의 서명이 일치하지 않습니다."),
    JWT_TOKEN_ERROR(HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", "토큰이 구조가 이상하거나 데이터가 일치하지 않습니다."),
    JWT_TOKEN_UNSUPPORTED_ERROR(HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", "지원하지 않는 토큰입니다."),
    JWT_TOKEN_ILL_EXCEPTION(HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", "JWT 처리 과정에서 오류가 발생했습니다."),
    JWT_UNKNOWN_EXCEPTION(HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", "JWT 처리과정에서 알수없는 오류가 발생했습니다."),
    JWT_EMPTY_EXCEPTION(HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", "토큰을 넣어주세요."),
}
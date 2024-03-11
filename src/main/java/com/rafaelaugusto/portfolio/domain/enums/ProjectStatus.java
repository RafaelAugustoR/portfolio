package com.rafaelaugusto.portfolio.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ProjectStatus {
    TESTING("Em teste"),
    FINALIZED("Finalizado"),
    IN_PROCESS("Em processo");

    private final String status;
}

package dev.javacadabra.demo.procesar_pagos;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.Variable;

@Component
public class CargarTarjetaCreditoWorker {

    private final static Logger LOG = LoggerFactory.getLogger(CargarTarjetaCreditoWorker.class);

    @JobWorker(type = "cargar-tarjeta-credito")
    public Map<String, Double> cargarTarjetaCredito(@Variable(name = "totalConImpuestos") Double totalConImpuestos) {
        LOG.info("cargando tarjeta de credito: {}", totalConImpuestos);
        return Map.of("importeCargado", totalConImpuestos);
    }
}

package dev.javacadabra.demo.procesar_pagos;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.spring.client.annotation.Deployment;

@SpringBootApplication
@Deployment(resources = "classpath:procesar-pagos.bpmn")
public class ProcesarPagosApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(ProcesarPagosApplication.class);

	@Autowired
	private ZeebeClient zeebeClient;

	public static void main(String[] args) {
		SpringApplication.run(ProcesarPagosApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		var bpmnProcesoId = "procesar-pagos";
		var evento = zeebeClient.newCreateInstanceCommand()
				.bpmnProcessId(bpmnProcesoId)
				.latestVersion()
				.variables(Map.of("total", 100))
				.send()
				.join();
		LOG.info("iniciada una instancia del proceso: {}", evento.getProcessInstanceKey());
	}
}

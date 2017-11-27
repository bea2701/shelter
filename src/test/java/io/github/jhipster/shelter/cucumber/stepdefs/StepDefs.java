package io.github.jhipster.shelter.cucumber.stepdefs;

import io.github.jhipster.shelter.ShelterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ShelterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

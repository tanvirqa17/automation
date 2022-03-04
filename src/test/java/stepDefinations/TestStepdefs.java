package stepDefinations;


import domain.Event;
import domain.ScenarioEvent;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.Scenario;
import org.json.JSONObject;
import org.junit.Assert;
import sendRESTRequest.RESTUtils;

import java.io.IOException;
import java.time.Instant;


public class TestStepdefs {

    public static Integer eventId = 0;
    public static String scenarioName;
    public static String scenarioStatus;

    public static RESTUtils restUtils = new RESTUtils();

    @Given("This is sample step scenario 1 step 1")
    public void thisIsSampleStepScenario1Step1() {
        System.out.println("This is scenario 1-1");
    }

    @Given("This is sample step scenario 1 step 2")
    public void thisIsSampleStepScenario1Step2() {
        System.out.println("This is scenario 1-2");

    }

    @Given("This is sample step scenario 2 step 1")
    public void thisIsSampleStepScenario2Step1() {
        System.out.println("This is scenario 2-1");
    }

    @Given("This is sample step scenario 2 step 2")
    public void thisIsSampleStepScenario2Step2() {
        System.out.println("This is scenario 2-2");
        Assert.fail();
    }

    @Given("This is sample step scenario 3 step 1")
    public void thisIsSampleStepScenario3Step1() {
        System.out.println("This is scenario 3-1");
    }

    @Given("This is sample step scenario 3 step 2")
    public void thisIsSampleStepScenario3Step2() {
        System.out.println("This is scenario 3-2");
    }

    @Given("This is sample step scenario 4 step 1")
    public void thisIsSampleStepScenario4Step1() {
        System.out.println("This is scenario 4-1");
    }

    @Given("This is sample step scenario 4 step 2")
    public void thisIsSampleStepScenario4Step2() {
        Assert.fail();
        System.out.println("This is scenario 4-2");
    }


    @After
    public void after(Scenario scenario) {
        Status status = scenario.getStatus();
        eventId = ++eventId;
        scenarioName = scenario.getName();
        scenarioStatus = status.toString();

        ScenarioEvent scenarioEvent = new ScenarioEvent();
        scenarioEvent.setScenarioName(scenarioName);
        scenarioEvent.setScenarioStatus(scenarioStatus);

        Event event = new Event();
        event.setEventId(eventId);
        event.setScenarioEvent(scenarioEvent);

        JSONObject jsonObject = new JSONObject(event);
        String requestBody = jsonObject.toString(4);
        System.out.println(requestBody);

        try {
            restUtils.sendRESTRequestToKafkaProxyService(requestBody);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

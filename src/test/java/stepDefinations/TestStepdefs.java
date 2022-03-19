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
import java.util.Random;


public class TestStepdefs {

    public static Integer eventId = 0;
    public static String scenarioName;
    public static String scenarioStatus;

    public static RESTUtils restUtils = new RESTUtils();

    String[] arr = {"PASSED", "FAILED"};
    Random random = new Random();


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

    @Given("This is step for scenario 1")
    public void thisIsStepForScenario1() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 2")
    public void thisIsStepForScenario2() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 3")
    public void thisIsStepForScenario3() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 4")
    public void thisIsStepForScenario4() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 5")
    public void thisIsStepForScenario5() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 6")
    public void thisIsStepForScenario6() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 7")
    public void thisIsStepForScenario7() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 8")
    public void thisIsStepForScenario8() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 9")
    public void thisIsStepForScenario9() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 10")
    public void thisIsStepForScenario10() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 11")
    public void thisIsStepForScenario11() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 12")
    public void thisIsStepForScenario12() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 13")
    public void thisIsStepForScenario13() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 14")
    public void thisIsStepForScenario14() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 15")
    public void thisIsStepForScenario15() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 16")
    public void thisIsStepForScenario16() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 17")
    public void thisIsStepForScenario17() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 18")
    public void thisIsStepForScenario18() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 19")
    public void thisIsStepForScenario19() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 20")
    public void thisIsStepForScenario20() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 21")
    public void thisIsStepForScenario21() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 22")
    public void thisIsStepForScenario22() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 23")
    public void thisIsStepForScenario23() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 24")
    public void thisIsStepForScenario24() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 25")
    public void thisIsStepForScenario25() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 26")
    public void thisIsStepForScenario26() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 27")
    public void thisIsStepForScenario27() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 28")
    public void thisIsStepForScenario28() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 29")
    public void thisIsStepForScenario29() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }

    @Given("This is step for scenario 30")
    public void thisIsStepForScenario30() throws InterruptedException {
        Thread.sleep(2000);
        int select = random.nextInt(arr.length);
        if (arr[select].equalsIgnoreCase("PASSED")) {
            Assert.assertTrue(true);
        } else if (arr[select].equalsIgnoreCase("FAILED"))
            Assert.fail();
    }
}

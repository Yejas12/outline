package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class test {

    private int consignacion, resto ;
    @Given("gano {int} mensuales")
    public void consigna(int consignacion) {
        this.consignacion = consignacion;
    }

    @When("pago gastos que son {int}")
    public void gasto(int gasto) {
        this.resto = this.consignacion-gasto;
    }

    @Then("me deberia quedar {int}")
    public void calcula(int resto) {
        Assert.assertEquals(this.resto,resto);
    }

}

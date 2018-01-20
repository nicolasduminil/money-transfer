package fr.simplex_software.eip.money_transfer;

import org.apache.camel.*;
import org.apache.commons.lang3.builder.*;
import org.slf4j.*;

import fr.simplex_software.eip.money_transfer.jaxb.*;

public class TestProcessor implements Processor
{
  private static Logger slf4jLogger = LoggerFactory.getLogger(TestProcessor.class);

  @Override
  public void process(Exchange exchange) throws Exception
  {
    slf4jLogger.debug("*** TestProcessor.process(): Route Id {} body {} ", exchange.getFromRouteId(), exchange.getIn().getBody());
    MoneyTransfers mts = exchange.getIn().getBody(MoneyTransfers.class);
    slf4jLogger.debug("*** TestProcessor.process(): mts {}", mts.getMoneyTransfers().get(0).getSourceAccount().getBankName());
    exchange.getIn().setBody(new ReflectionToStringBuilder(mts).toString());
  }
}

package fr.simplex_software.eip.money_transfer;

import org.apache.commons.lang3.builder.*;
import org.slf4j.*;

import fr.simplex_software.eip.money_transfer.jaxb.*;

public class StringifyBean
{
  private static Logger slf4jLogger = LoggerFactory.getLogger(StringifyBean.class);
  
  public String stringify (MoneyTransfer moneyTransfer)
  {
    String strMoneyTransfer = new ReflectionToStringBuilder(moneyTransfer, new RecursiveToStringStyle().JSON_STYLE).toString();
    slf4jLogger.info("*** StringifyBean.stringify(): Returning {}", strMoneyTransfer);
    return strMoneyTransfer;
  }
}

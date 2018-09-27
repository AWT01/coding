/**
 * Refactor Code Tasks
 */
package org.foundation.coding;

import java.util.ArrayList;
import org.foundation.coding.customer.Customer;
import org.foundation.coding.rental.Rental;

/**
 * This class help to print the message.
 */
public class Statement {

  //The customer contains the info of rental movies
  private Customer customer;

  /**
   * Constructor.
   * @param customer parameter.
   */
  public Statement(final Customer customer) {
    this.customer = customer;
  }

  /**
   * The format of the rental information.
   * @return plus string added.
   */
  public StringBuilder statement() {
    StringBuilder textToShow = new StringBuilder();
    ArrayList<Rental> rentals = customer.getRentals();

    String result = "Rental Record for " + customer.getName() + "\n";
    textToShow.append(result);

    double totalFees = 0;
    int totalPoints = 0;

    for (Rental rental:rentals) {
      totalFees +=  customer.getTotalFeeRental(rental);
      totalPoints += customer.retrievePoints(rental);
    }

    textToShow.append("**********************************\n");
    textToShow.append("Amount owed is " + totalFees);
    textToShow.append("\n");
    textToShow.append("***********************************\n");
    textToShow.append("You earned " + totalPoints);
    textToShow.append(" frequent renter points");
    return textToShow;
  }
}

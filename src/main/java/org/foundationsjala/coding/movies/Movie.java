package org.foundationsjala.coding.movies;

import org.foundationsjala.coding.movies.Type;
import org.foundationsjala.coding.movies.Type.TypeStatus;

public class Movie {
  private String _title;
  private int _priceCode;
  private Type status;

  public Movie(String title, int priceCode) {
    _title = title;
    _priceCode = priceCode;
  }

  public int getPriceCode() {
    return _priceCode;
  }

  public void setPriceCode(int arg) {
    _priceCode = arg;
  }

  public String getTitle() {
    return _title;
  }

  public int getType(Type type) {
    this.status = type;
    
    if TypeStatus.CHILDRENS ==

     /* status = type;
    switch (status) {
      case CHILDRENS: return 2;
      case REGULAR: return 0;
      case NEW_RELEASE: return 1;
      default:
        break;
    }
    return 0;*/

  }
}

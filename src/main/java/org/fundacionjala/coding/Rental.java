package org.fundacionjala.coding;

/**
 * class rental it has a 1 to 1 relation
 * with movie class
 */
public class Rental {
    private Movie movie;
    private int daysRented;
    private int rentPoint;

    /**
     * constructor of rental class
     *
     * @param movie
     * @param daysRented
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
        if (movie instanceof MovieNew){
            this.rentPoint = 2;
        }else {
            this.rentPoint = 1;
        }
    }

    /**
     * getter of day rented
     *
     * @return number of days rented the movie
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * getter of movie
     *
     * @return movie
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * getter rent point
     *
     * @return rent point value
     */
    public int getRentPoint() {
        return rentPoint;
    }

    /**
     * amount of the rent of the movie
     * @return subtotal of rent
     */
    public double getRentCost(){
        double cost;
        cost = movie.getCost();
        if (movie instanceof MovieChildren){
            if (daysRented > 3){
                cost += (daysRented - 3) * 1.5;
            }
            return cost;
        }

        if (movie instanceof MovieRegular){
            if (daysRented > 2){
                cost += (daysRented - 2) * 1.5;
            }
            return cost;
        } else{
            cost *= daysRented;
            return cost;
        }
    }
}
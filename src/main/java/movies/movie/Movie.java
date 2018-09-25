/*
 * @(#)Main.java
 *
 * Copyright (c) 2018 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

/**
 * Movies class for rental
 *
 * @version 1.0.
 */
package movies.movie;

public class Movie {
    private String title;

    public Movie(String title) {
        title = title;
    }

    public String getTitle() {
        return title;
    }

}

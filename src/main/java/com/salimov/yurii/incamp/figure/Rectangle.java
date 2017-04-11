package com.salimov.yurii.incamp.figure;

/**
 * The interface describes a set of methods
 * for working with a Rectangle geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Rectangle extends Figure {

    /**
     * Returns a rectangle width.
     *
     * @return a rectangle width.
     */
    double getWidth();

    /**
     * Sets a new width for a rectangle.
     *
     * @param width a new rectangle width.
     */
    void setWidth(double width);

    /**
     * Returns a rectangle height.
     *
     * @return a rectangle height.
     */
    double getHeight();

    /**
     * Sets a new height for a rectangle.
     *
     * @param height a new rectangle height.
     */
    void setHeight(double height);

    /**
     * Calculates and returns a point A of a rectangle.
     *
     * @return a point A of a rectangle.
     */
    Point getPointA();

    /**
     * Calculates and returns a point B of a rectangle.
     *
     * @return a point B of a rectangle.
     */
    Point getPointB();

    /**
     * Calculates and returns a point C of a rectangle.
     *
     * @return a point C of a rectangle.
     */
    Point getPointC();

    /**
     * Calculates and returns a point D of a rectangle.
     *
     * @return a point D of a rectangle.
     */
    Point getPointD();
}
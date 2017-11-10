
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay

{

    private int limit;

    private int value;


    /**

     * Constructor for objects of class NumberDisplay.

     * Set the limit at which the display rolls over.

     */

    public NumberDisplay(int rollOverLimit)

    {

        limit = rollOverLimit;

        value = 0;

    }



    /**

     * Return the current value.

     */

    public int getValue()

    {

        return value;

    }



    /**

     * Return the display value (that is, the current value as a two-digit

     * String. If the value is less than ten, it will be padded with a leading

     * zero).

     */

    public String getDisplayValue()

    {

        if(value < 10) {
            //si es menor que 10 value se devuelve un string menor que 10 con un 0 delante
            return "0" + value;

        }

        else {
            //si no, devuelve el valor de value con formato string de dos digitos
            return "" + value;

        }

    }



    /**

     * Set the value of the display to the new specified value. If the new

     * value is less than zero or over the limit, do nothing.

     */

    public void setValue(int replacementValue)

    {

        if((replacementValue >= 0) && (replacementValue < limit)) {

            value = replacementValue;

        }

    }



    /**

     * Increment the display value by one, rolling over to zero if the

     * limit is reached.

     */

    public void increment()

    {
        /** al invocar este metodo devuelve el resto de la division
         * EJEMPLO, si vale limit 7 value es 1 porque 1 (value +1)/ 7 da de RESTO 0
        */
        value = (value + 1) % limit;

    }

}
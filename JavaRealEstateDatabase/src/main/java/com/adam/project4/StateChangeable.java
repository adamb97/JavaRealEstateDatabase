
package com.adam.project4;

/**
 Date: 8/11/2020
 * Class: CMIS 242
 * 
 *
 * @author Adam Benalayat.
 * This interface outlines the functionality for changeable state of an enumerated type parameter
 */
public interface StateChangeable<T extends Enum<T>> {
    public void changeState(T t);
}

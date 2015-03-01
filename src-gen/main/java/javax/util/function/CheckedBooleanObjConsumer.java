/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface CheckedBooleanObjConsumer<U> extends Serializable {

    static final long serialVersionUID = 1L;

    void accept(boolean value, U u) throws Throwable;

    default CheckedBooleanObjConsumer<U> andThen(CheckedBooleanObjConsumer<? super U> after) {
        Objects.requireNonNull(after);
        return (boolean value, U u) -> { accept(value, u); after.accept(value, u); };
    }

}
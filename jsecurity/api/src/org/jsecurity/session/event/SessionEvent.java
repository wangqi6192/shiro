/*
 * Copyright (C) 2005 Les A. Hazlewood
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
 * Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the
 *
 * Free Software Foundation, Inc.
 * 59 Temple Place, Suite 330
 * Boston, MA 02111-1307
 * USA
 *
 * Or, you may view it online at
 * http://www.opensource.org/licenses/lgpl-license.php
 */
package org.jsecurity.session.event;

import java.io.Serializable;
import java.util.Calendar;
import java.util.EventObject;

/**
 * General event concerning a {@link org.jsecurity.session.Session} instance.
 *
 * todo We need to decide whether or not to extend EventObject. -JCH
 *
 * @author Les Hazlewood
 */
public abstract class SessionEvent extends EventObject {

    /**
     * Timestamp when this even took place.
     */
    protected Calendar timestamp = Calendar.getInstance();

    /**
     * Session ID associated with this event.
     */
    protected final Serializable sessionId;

    /**
     * Constructs a new session event associated with the specified session.
     *
     * @param sessionId the session id of the session associated with this event.
     */
    public SessionEvent( Serializable sessionId ) {
        this( sessionId, sessionId );
    }


    /**
     * Constructs a new session event with the given source and session ID.
     *
     * @param source the source of this event.
     * @param sessionId the session ID of the session associated with this event.
     */
    public SessionEvent( Object source, Serializable sessionId ) {
        super( source );
        this.sessionId = sessionId;
    }

    /**
     * Returns the timestamp associated with this event.
     *
     * @return the timestamp associated with this event.
     */
    public Calendar getTimestamp() {
        return timestamp;
    }

}

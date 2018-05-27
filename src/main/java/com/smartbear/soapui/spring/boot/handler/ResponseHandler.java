package com.smartbear.soapui.spring.boot.handler;

import com.eviware.soapui.model.iface.Response;
import com.eviware.soapui.support.SoapUIException;

/**
 * Handler that encapsulates the process of generating a response object
 * from a {@link Response}.
 */
public interface ResponseHandler<T> {

    /**
     * Processes an {@link Response} and returns some value
     * corresponding to that response.
     *
     * @param response The response to process
     * @return A value determined by the response
     *
     * @throws SoapUIException in case of a problem or the connection was aborted
     */
    T handleResponse(Response response) throws SoapUIException;

}

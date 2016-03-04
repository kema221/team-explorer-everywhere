// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._LocationWebServiceSoap_QueryServices;
import ms.ws._ServiceTypeFilter;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _LocationWebServiceSoap_QueryServices
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _ServiceTypeFilter[] serviceTypeFilters;
    protected int lastChangeId;

    public _LocationWebServiceSoap_QueryServices()
    {
        super();
    }

    public _LocationWebServiceSoap_QueryServices(
        final _ServiceTypeFilter[] serviceTypeFilters,
        final int lastChangeId)
    {
        // TODO : Call super() instead of setting all fields directly?
        setServiceTypeFilters(serviceTypeFilters);
        setLastChangeId(lastChangeId);
    }

    public _ServiceTypeFilter[] getServiceTypeFilters()
    {
        return this.serviceTypeFilters;
    }

    public void setServiceTypeFilters(_ServiceTypeFilter[] value)
    {
        this.serviceTypeFilters = value;
    }

    public int getLastChangeId()
    {
        return this.lastChangeId;
    }

    public void setLastChangeId(int value)
    {
        this.lastChangeId = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.serviceTypeFilters != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("serviceTypeFilters");

            for (int iterator0 = 0; iterator0 < this.serviceTypeFilters.length; iterator0++)
            {
                this.serviceTypeFilters[iterator0].writeAsElement(
                    writer,
                    "ServiceTypeFilter");
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "lastChangeId",
            this.lastChangeId);

        writer.writeEndElement();
    }
}